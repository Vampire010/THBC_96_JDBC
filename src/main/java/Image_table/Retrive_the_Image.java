package Image_table;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Retrive_the_Image {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/thbc_96_jdbc","root","1992");
		PreparedStatement ps=con.prepareStatement("select * from imgtable");
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getObject(1)+" "+rs.getBlob(2));
			
		}

		con.close();
	}

}
