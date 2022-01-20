package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.junit.Test;

public class user_Query {

	@Test
	public void test() throws ClassNotFoundException, SQLException
	{
		String Query ;

		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chinook","root","1992");
		Statement stmt=con.createStatement();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the Query");
		Query= sc.nextLine();
		ResultSet rs=stmt.executeQuery(Query);
		
		while(rs.next())
		{
			System.out.println(rs.getObject(1)+" "+rs.getObject(2)+" "+rs.getString(3));
			
		}
		con.close();
	}

}
