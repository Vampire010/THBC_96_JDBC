package Image_table;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_Image_InTo_Table {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/thbc_96_jdbc","root","1992");
		PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");
		ps.setString(1,"sonoo");

		FileInputStream fin=new FileInputStream("C:\\Users\\91973\\Desktop\\image001.png");
		ps.setBinaryStream(2,fin,fin.available());
		int i=ps.executeUpdate();

		System.out.println(i+" records affected");

		con.close();

	}

}
