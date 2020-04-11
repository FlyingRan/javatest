package xhr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbctest06batch {
	public static void main(String[] args) throws Exception{
		//批处理，讲一批sql语句同时进行，增加效率
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "root","ml319xhr");
		
		if(!cn.isClosed()) System.out.println("Successfully connected!");
		String sql = "insert into xhr values(null,?)";
		
		PreparedStatement ps = cn.prepareStatement(sql);
		
		for(int i = 0 ;i<100;i++) {
			ps.setString(1, i+"i");
			ps.addBatch();
		}
		ps.executeBatch();
		
		ps.close();
		cn.close();
	}
}
