package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Meta_data {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/thbc_96_jdbc","root","1992");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student");
		ResultSetMetaData rsmd=rs.getMetaData();

		System.out.println("Total columns: "+rsmd.getColumnCount());
		System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));
		System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));

		con.close();

	}

}
