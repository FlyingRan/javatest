package xhr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class jdbctest05 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//获取连接
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "root", "ml319xhr");
		
		if(!cn.isClosed()) System.out.println("连接成功！");
		//编写sql
		String sql = "Insert into xhr values(null,?)";
		
		//创建preparedStatement
		//在Statement这个接口中，声明了几个常量，其中一个是Statement.RETURN_GENERATED_KEYS，表示返回自增长的键值
		PreparedStatement ps = cn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		
		ps.setString(1, "许浩然");
		
		int len = ps.executeUpdate();
		
		System.out.println(len>0?"vistory!":"defeat!");
		
		ResultSet rs = ps.getGeneratedKeys();
		if(rs.next()) {
			System.out.println("新的姓名编号："+rs.getObject(1));
		}
		
		rs.close();
		ps.close();
		cn.close();
		
	}
}
