package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_Data {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{

		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/thbc_96_jdbc","root","1992");
		Statement stmt=con.createStatement();
		
		
		
		String Query= "insert into student values(1,'Jonson',9876543210);";		
		
		
		int rs=stmt.executeUpdate(Query);
		System.out.print("rows affected " + rs);
		con.close();
	}

}
