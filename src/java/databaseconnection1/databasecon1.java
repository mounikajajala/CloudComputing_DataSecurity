package databaseconnection1;
import java.sql.*;

public class databasecon1
{
	static Connection con;
	public static Connection getconnection()
	{
 		
 			
		try
		{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");	
			//con = DriverManager.getConnection("jdbc:odbc:cloudserver1","root","root");
                    Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudserver1", "root", "root");
		}
		catch(Exception e)
		{
			System.out.println("class error");
		}
		return con;
	}
	
}
