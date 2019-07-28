
package com.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCArch 
{
	
	Connection con;
	Statement stmt;
	//PreparedStatement ps;
	ResultSet rs;
	
	public void connect ()
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","pallai");
			stmt=con.createStatement();
			System.out.println("connection esatablish");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args)
	{
		JDBCArch architecture= new JDBCArch ();
		architecture.connect();
		//architecture.executeSelect();
		//architecture.executeUpdate();
		
	}

	
}
