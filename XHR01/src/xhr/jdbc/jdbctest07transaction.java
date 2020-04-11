package xhr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbctest07transaction {

	public static void main(String[] args) throws Exception{
		//事务处理，例如需要两条sql语句同时成功，或者同时失败
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC","root","ml319xhr");
		if(!cn.isClosed())System.out.println("successful connected");
		cn.setAutoCommit(false);//设置自动提交为false
		String sql1 = "delete from xhr where name = ?";
		String sql2 = "delete from xhr where name = ?";
		PreparedStatement ps1 = cn.prepareStatement(sql1);
		PreparedStatement ps2 = cn.prepareStatement(sql2);
		
		ps1.setObject(1, "hmg");
		ps2.setObject(1, "许浩然");
		
		try {
			int len1 = ps1.executeUpdate();
			if(len1 > 0 ) {
				int len2 = ps2.executeUpdate();
				if(len2>0) {
					cn.commit();
					System.out.println("删除成功");
				}else {
					cn.rollback();
				}
			}else 
				cn.rollback();
		} catch (Exception e) {
			System.out.println("异常"+e.getMessage());
			
			cn.rollback();
		}
		
		ps1.close();
		ps2.close();
		cn.setAutoCommit(true);
		cn.close();
	}

}
