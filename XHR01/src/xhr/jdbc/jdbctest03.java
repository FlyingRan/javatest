package xhr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class jdbctest03 {

	public static void main(String[] args) throws Exception {
		//加载驱动
		Class.forName("com.mysql.cj.jdbc.Driver");
		//创建连接
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=UTC ", "root", "ml319xhr");
		
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
		
		String sql ="insert into course values(?,?,?,?)";
		
		//创建statement的子类preparedStatement
		PreparedStatement ps = cn.prepareStatement(sql);
		//为‘？’ 设置值，避免sql拼接
		ps.setObject(1, "11");
		ps.setString(2, cname);
		ps.setObject(3, null);
		ps.setInt(4, credit);
		//执行sql
		int len = ps.executeUpdate();
		
		System.out.println(len>0?"Vistory!":"defeat!");
		sc.close();
		ps.close();
		cn.close();
	}

}
