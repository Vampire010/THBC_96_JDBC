package Create_FILETABLE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FILETABLE 
{
	public static void main(String [] args) throws SQLException, ClassNotFoundException, IOException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/thbc_96_jdbc","root","1992");

		PreparedStatement ps=con.prepareStatement("insert into filetable values(?,?)");
		
		ps.setInt(1,22);

		FileInputStream fin=new FileInputStream("C:\\Users\\91973\\Desktop\\CSM_v1.pdf");
		ps.setBinaryStream(2,fin,fin.available());
		int i=ps.executeUpdate();

		System.out.println(i+" records affected");

		con.close();

	}

}
