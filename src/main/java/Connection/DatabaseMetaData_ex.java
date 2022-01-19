package Connection;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseMetaData_ex {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/thbc_96_jdbc","root","1992");
		DatabaseMetaData dbmd=con.getMetaData();
		
		System.out.println("Driver Name: "+dbmd.getDriverName());
		System.out.println("Driver Version: "+dbmd.getDriverVersion());
		System.out.println("UserName: "+dbmd.getUserName());
		System.out.println("Database Product Name: "+dbmd.getDatabaseProductName());
		System.out.println("Database Product Version: "+dbmd.getDatabaseProductVersion());

		con.close();
	}

}
