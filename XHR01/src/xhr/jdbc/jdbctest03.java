package xhr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class jdbctest03 {

	public static void main(String[] args) throws Exception {
		//��������
		Class.forName("com.mysql.cj.jdbc.Driver");
		//��������
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC ", "root", "ml319xhr");
		
		if(!cn.isClosed()) {
			System.out.println("���ӳɹ���");
		}
		Scanner sc= new Scanner(System.in);
		
		System.out.println("������Ҫ��ӵĿγ̺ţ�");
		int cno = sc.nextInt();
		System.out.println("������Ҫ��ӵĿγ�����");
		String cname = sc.next();
		System.out.println("������Ҫ��ӵ�cpno��");
		int cpno = sc.nextInt();
		System.out.println("������Ҫ��ӵ�ѧ�֣�");
		int credit= sc.nextInt();
		
		String sql ="insert into course values(?,?,?,?)";
		
		//����statement������preparedStatement
		PreparedStatement ps = cn.prepareStatement(sql);
		//Ϊ������ ����ֵ������sqlƴ��
		ps.setObject(1, "11");
		ps.setString(2, cname);
		ps.setObject(3, null);
		ps.setInt(4, credit);
		//ִ��sql
		int len = ps.executeUpdate();
		
		System.out.println(len>0?"Vistory!":"defeat!");
		sc.close();
		ps.close();
		cn.close();
	}

}
