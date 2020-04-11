package xhr.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.mysql.cj.xdevapi.PreparableStatement;

public class jdbctools1 {
	private static DataSource ds;
	static {
		
		try {
			Properties pro = new Properties();
			pro.load(jdbctools1.class.getClassLoader().getResourceAsStream("druid.properties"));
			ds = DruidDataSourceFactory.createDataSource(pro);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection() throws Exception{
		return ds.getConnection();
	}
	
	public static void free(Connection cn) {
		if(cn!=null) {
			try {
				cn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	//只适用于不需要事务处理的情况
	public static int updata(String sql,Object... args) throws Exception {
		Connection conn =getConnection();
		 PreparedStatement ps = conn.prepareStatement(sql);
		if(args!=null && args.length>0) {
			for(int i=0;i<args.length;i++) {
				ps.setObject(i+1, args[i]);
			}
		}
		int len = ps.executeUpdate();
		ps.close();
		conn.close();
		return len;
	}
	public static int update(Connection conn, String sql, Object... args) throws SQLException{
		PreparedStatement ps = conn.prepareStatement(sql);
		//设置？
		if(args!=null && args.length>0){
			for (int i = 0; i < args.length; i++) {
				ps.setObject(i+1, args[i]);
			}
		}
		//执行sql
		int len = ps.executeUpdate();
		ps.close();
		return len;
	}
}
