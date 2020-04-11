package xhr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class jdbctest02 {

	public static void main(String[] args) throws Exception {
		//加载驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		//建立连接
		String url = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
		Connection cn = DriverManager.getConnection(url, "root", "ml319xhr");
		if(!cn.isClosed()) {
			System.out.println("连接成功！");
		}
		Scanner sc= new Scanner(System.in);
		
		System.out.println("请输入要添加的课程号：");
		int cno = sc.nextInt();
		System.out.println("请输入要添加的课程名：");
		String cname = sc.next();
		System.out.println("请输入要添加的cpno：");
		int cpno = sc.nextInt();
		System.out.println("请输入要添加的学分：");
		int credit= sc.nextInt();
		
		//创建statement
		Statement cs = cn.createStatement();
		String sql = "insert into course values('"+cno+"','"+cname+"','"+cpno+"','"+credit+"')";
		int len = cs.executeUpdate(sql);
		System.out.println(len>0?"添加成功！":"添加失败！");
		sc.close();
		cn.close();
	}

}
