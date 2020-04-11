package xhr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



public class jdbctest05 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//��ȡ����
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC", "root", "ml319xhr");
		
		if(!cn.isClosed()) System.out.println("���ӳɹ���");
		//��дsql
		String sql = "Insert into xhr values(null,?)";
		
		//����preparedStatement
		//��Statement����ӿ��У������˼�������������һ����Statement.RETURN_GENERATED_KEYS����ʾ�����������ļ�ֵ
		PreparedStatement ps = cn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
		
		ps.setString(1, "���Ȼ");
		
		int len = ps.executeUpdate();
		
		System.out.println(len>0?"vistory!":"defeat!");
		
		ResultSet rs = ps.getGeneratedKeys();
		if(rs.next()) {
			System.out.println("�µ�������ţ�"+rs.getObject(1));
		}
		
		rs.close();
		ps.close();
		cn.close();
		
	}
}
