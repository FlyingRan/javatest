package xhr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class jdbctest02 {

	public static void main(String[] args) throws Exception {
		//��������
		Class.forName("com.mysql.cj.jdbc.Driver");
		//��������
		String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
		Connection cn = DriverManager.getConnection(url, "root", "ml319xhr");
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
		
		//����statement
		Statement cs = cn.createStatement();
		String sql = "insert into course values('"+cno+"','"+cname+"','"+cpno+"','"+credit+"')";
		int len = cs.executeUpdate(sql);
		System.out.println(len>0?"��ӳɹ���":"���ʧ�ܣ�");
		sc.close();
		cn.close();
	}

}
