package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Retrive_the_Data {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String Query = "select * from album";

		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chinook","root","1992");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(Query);
		while(rs.next())
		{
			System.out.println(rs.getObject(1)+" "+rs.getObject(2)+" "+rs.getString(3));
			
		}
		con.close();
	}

}
