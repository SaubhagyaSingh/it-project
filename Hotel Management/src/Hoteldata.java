
import java.sql.*;
import javax.swing.*;
public class Hoteldata
{
public static Connection connectDB()
{
	try 
	{

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/hoteldatabase\",\"root\",\"root");
       JOptionPane.showMessageDialog(null, "connection made");
		return conn;
	}
		catch (Exception e )
		{
			JOptionPane.showMessageDialog(null, "connection errorrr");
		return null;
		}
	}
}	

