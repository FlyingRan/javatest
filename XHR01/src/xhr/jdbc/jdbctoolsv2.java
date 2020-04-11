package xhr.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

public class jdbctoolsv2 {
	private static DataSource ds;
	private static ThreadLocal<Connection> th;
	static {
		Properties pro = new Properties();
		try {
			pro.load(jdbctoolsv2.class.getClassLoader().getResourceAsStream("druid.properties"));

			DataSource d = DruidDataSourceFactory.createDataSource(pro);
		
			th = new ThreadLocal<Connection>();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException{
		//方式一：DriverManager.getConnection()
		//方式二：连接池对象.getConnection()
		Connection conn = th.get();//获取当前线程中的共享的连接对象
		if(conn == null){//当前线程没有拿过连接，第一个获取连接
			conn = ds.getConnection();//从连接池中拿一个新的
			th.set(conn);//放到当前线程共享变量中
		}
		return conn;
	}
	
	//把编译时异常转为运行时异常
	public static void free(Connection conn){
		try {
			if(conn != null){
				conn.close();
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static int update(String sql,Object... args) throws SQLException{
		Connection conn = getConnection();
		PreparedStatement pst = conn.prepareStatement(sql);
		if(args!=null && args.length>0){
			for (int i = 0; i < args.length; i++) {
				pst.setObject(i+1, args[i]);
			}
		}
		
		int len = pst.executeUpdate();
		pst.close();
		return len;
	}
}
