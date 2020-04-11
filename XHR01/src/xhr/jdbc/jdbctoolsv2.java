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
		//��ʽһ��DriverManager.getConnection()
		//��ʽ�������ӳض���.getConnection()
		Connection conn = th.get();//��ȡ��ǰ�߳��еĹ�������Ӷ���
		if(conn == null){//��ǰ�߳�û���ù����ӣ���һ����ȡ����
			conn = ds.getConnection();//�����ӳ�����һ���µ�
			th.set(conn);//�ŵ���ǰ�̹߳��������
		}
		return conn;
	}
	
	//�ѱ���ʱ�쳣תΪ����ʱ�쳣
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
