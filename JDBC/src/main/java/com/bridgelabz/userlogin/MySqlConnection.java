/**
 * package com.bridgelabz.userlogin;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection 
{
	private static Connection connection;
	static
	{
		try 
		{            
			Class.forName("com.mysql.jdbc.Driver");

			connection=DriverManager.getConnection("\"jdbc:mysql://localhost:3306/bridgelabzdatabase","root","Harshi@1");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	private MySqlConnection()
	{	 }
	
	public static Connection getConnection()
	{
		return connection;
	}
	
	
}
**/