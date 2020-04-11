package xhr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbctest1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//加载驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		//创建连接
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc?serverTimezone=GMT%2B8", "root", "ml319xhr");
		//创建statement
		if(!cn.isClosed()) System.out.println("连接成功！");
		Statement sta = cn.createStatement();
		
		String str = "select * from sc";
		//执行sql，获得resultSet，executeQuery通常用于select
		ResultSet executeQuery = sta.executeQuery(str);
		//遍历resultset，获得查询结果
		while (executeQuery.next()){
			//getObject(n),n代表第n个字段
			System.out.println(executeQuery.getObject(1)+"\t"+executeQuery.getObject(2)+"\t");
		}
		
	}

}
