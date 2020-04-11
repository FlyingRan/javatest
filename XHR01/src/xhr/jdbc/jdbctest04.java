package xhr.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbctest04 {
	public static void main(String[] args) throws Exception {
		//¼ÓÔØÇý¶¯
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "root", "ml319xhr");
		
		String sql = "insert into photos values (?,?)";
		
		PreparedStatement ps = cn.prepareStatement(sql);
		ps.setObject(2,"xhr");
	
		ps.setBlob(1,new FileInputStream("C:/Users/x0718/Desktop/Í¼Æ¬/css.png"));
		
		//Ö´ÐÐsql
		
		int len = ps.executeUpdate();
		System.out.println(len>0?"vistory!":"defeat!");
		ps.close();
		cn.close();
	}
}
