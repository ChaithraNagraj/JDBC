package com.bridgelabz.userlogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ForgotPassword 
{
	static Connection connection=ConnectionConfig.getDbConnection();
	UserDTO user=new UserDTO();
	
	public void getData()
	{
		System.out.println("Enter Your Contact/MobileNo");
		user.setContact(InputUtility.longVal());
		
		System.out.println("Enter New Your Password");
		user.setPassword(InputUtility.stringVal());
	}
	
	public void restPassword()
	{
		try {
			PreparedStatement statement=connection.prepareStatement
					("Update Register set password=? where contact=?");
			
			statement.setString(1, user.getPassword());
			statement.setLong(2, user.getContact());
			int result=statement.executeUpdate();
			if(result>0)
			{
				System.out.println("Your Password Changed Successfully");
			}
			else
			{
				try {
					throw new LoginException("Invalid mobile Number");
				} catch (LoginException e) {
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println();
			System.out.println("Sql syntax error");
		}
	}
}
