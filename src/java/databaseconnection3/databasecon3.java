package databaseconnection3;
import java.sql.*;

public class databasecon3
{
	static Connection con;
	public static Connection getconnection()
	{
 		
 			
			try
		{
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//con = DriverManager.getConnection("jdbc:odbc:cloudserver3","root","root");
                    Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloudserver3", "root", "root");
		}
		catch(Exception e)
		{
			System.out.println("class error");
		}
		return con;
	}
	
}
