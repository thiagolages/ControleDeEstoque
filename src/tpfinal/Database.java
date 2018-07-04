package tpfinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.ResultSet;

public class Database {
	
	private String host = "jdbc:mysql://sql10.freemysqlhosting.net";
	private String user = "sql10245207";
	private String pass = "MGqez2RKll";
	
	private static Connection conn = null;
	
	public static ResultSet query(String query) throws SQLException
	{

		  Statement stmt = Database.conn.createStatement();
		  stmt.executeQuery("USE `sql10245207`");
		  return stmt.executeQuery(query);

	}
	
	private Database()
	{
		 try 
		 {
	            // The newInstance() call is a work around for some
	            // broken Java implementations

	            Class.forName("com.mysql.cj.jdbc.Driver");
	     }
		 catch (Exception ex) 
		 {
	            System.out.println("Erro ao adicionar driver");
	     }
		 try
		{
			Database.setConn(DriverManager.getConnection(host, user, pass));
			// Statement stmt = conn.createStatement();	
		}
		catch (SQLException ex) 
		{
			System.out.print("Erro de conexao com o banco de dados");
		}
		
	}
	
	private static Connection getConn() {
		return conn;
	}

	private static void setConn(Connection conn) {
		Database.conn = conn;
	}

	public static Connection connectDatabase()
	{
		if(Database.conn == null)
		{
			new Database();
			return Database.getConn();
		}
		else
			return Database.getConn();
	}

	public static void update(String str) throws SQLException
	{
		  Statement stmt = Database.conn.createStatement();
		  stmt.executeQuery("USE `sql10245207`");
		  stmt.executeUpdate(str);
	}
	

}
