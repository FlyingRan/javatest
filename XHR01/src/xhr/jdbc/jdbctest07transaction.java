package xhr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbctest07transaction {

	public static void main(String[] args) throws Exception{
		//������������Ҫ����sql���ͬʱ�ɹ�������ͬʱʧ��
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC","root","ml319xhr");
		if(!cn.isClosed())System.out.println("successful connected");
		cn.setAutoCommit(false);//�����Զ��ύΪfalse
		String sql1 = "delete from xhr where name = ?";
		String sql2 = "delete from xhr where name = ?";
		PreparedStatement ps1 = cn.prepareStatement(sql1);
		PreparedStatement ps2 = cn.prepareStatement(sql2);
		
		ps1.setObject(1, "hmg");
		ps2.setObject(1, "���Ȼ");
		
		try {
			int len1 = ps1.executeUpdate();
			if(len1 > 0 ) {
				int len2 = ps2.executeUpdate();
				if(len2>0) {
					cn.commit();
					System.out.println("ɾ���ɹ�");
				}else {
					cn.rollback();
				}
			}else 
				cn.rollback();
		} catch (Exception e) {
			System.out.println("�쳣"+e.getMessage());
			
			cn.rollback();
		}
		
		ps1.close();
		ps2.close();
		cn.setAutoCommit(true);
		cn.close();
	}

}
