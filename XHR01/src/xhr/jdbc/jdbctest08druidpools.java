package xhr.jdbc;

import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

public class jdbctest08druidpools {
	public static void main(String[] args) throws Exception {
//		Properties pro = new Properties();
//		//硬编码的方式，手动添加配置参数（方式1）
//		pro.setProperty("url", "jdbc:mysql://localhost:3306/test?serverTimezone=UTC");
//		pro.setProperty("username", "root");
//		pro.setProperty("password", "ml319xhr");
//		DataSource ds = DruidDataSourceFactory.createDataSource(pro);
//		
		//（方式2）
		Properties pro = new Properties();
		//类加载器对象。getresourceStream（） 加载资源文件，并把配置文件中的数据封装到properties对象
		pro.load(jdbctest08druidpools.class.getClassLoader().getResourceAsStream("druid.properties"));
		
		DataSource ds = DruidDataSourceFactory.createDataSource(pro);
		
		
		
		for(int i=1;i<=30;i++) {
			Connection cn = ds.getConnection();
			System.out.println("number"+i+"connection"+cn);
			cn.close();
		}
		
	}
}
