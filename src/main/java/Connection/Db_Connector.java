package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class Db_Connector 
{
	String Query = "select * from album";
	@Test
	public void database_connect() throws SQLException, ClassNotFoundException
	{
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
