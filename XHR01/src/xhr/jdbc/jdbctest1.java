package xhr.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbctest1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//��������
		Class.forName("com.mysql.cj.jdbc.Driver");
		//��������
		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc?serverTimezone=GMT%2B8", "root", "ml319xhr");
		//����statement
		if(!cn.isClosed()) System.out.println("���ӳɹ���");
		Statement sta = cn.createStatement();
		
		String str = "select * from sc";
		//ִ��sql�����resultSet��executeQueryͨ������select
		ResultSet executeQuery = sta.executeQuery(str);
		//����resultset����ò�ѯ���
		while (executeQuery.next()){
			//getObject(n),n�����n���ֶ�
			System.out.println(executeQuery.getObject(1)+"\t"+executeQuery.getObject(2)+"\t");
		}
		
	}

}
