package databaseconnection2;
import java.sql.*;

public class databasecon2
{
	static Connection con;
	public static Connection getconnection()
	{
 		
 			
			try
		{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//con = DriverManager.getConnection("jdbc:odbc:cloudserver2","root","root");
                    Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudserver2", "root", "root");
		}
		catch(Exception e)
		{
			System.out.println("class error");
		}
		return con;
	}
	
}
