package xhr.jdbc;

import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

public class jdbctest08druidpools {
	public static void main(String[] args) throws Exception {
//		Properties pro = new Properties();
//		//Ӳ����ķ�ʽ���ֶ�������ò�������ʽ1��
//		pro.setProperty("url", "jdbc:mysql://localhost:3306/test?serverTimezone=UTC");
//		pro.setProperty("username", "root");
//		pro.setProperty("password", "ml319xhr");
//		DataSource ds = DruidDataSourceFactory.createDataSource(pro);
//		
		//����ʽ2��
		Properties pro = new Properties();
		//�����������getresourceStream���� ������Դ�ļ������������ļ��е����ݷ�װ��properties����
		pro.load(jdbctest08druidpools.class.getClassLoader().getResourceAsStream("druid.properties"));
		
		DataSource ds = DruidDataSourceFactory.createDataSource(pro);
		
		
		
		for(int i=1;i<=30;i++) {
			Connection cn = ds.getConnection();
			System.out.println("number"+i+"connection"+cn);
			cn.close();
		}
		
	}
}
