package Image_table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Image_table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/thbc_96_jdbc","root","1992");
		Statement stmt=con.createStatement();

		String Query= "CREATE TABLE IMGTABLE( NAME varchar(4000),PHOTO BLOB(100000));";
		
		int rs=stmt.executeUpdate(Query);
		System.out.print("rows affected" + rs);

		con.close();

	}

}
