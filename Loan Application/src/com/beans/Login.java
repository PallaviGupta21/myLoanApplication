package com.beans;

public class Login 
{
	private String userName;
	private String password;
	
	public Login (String userName,String password)
	{
		this.userName=userName;
		this.password=password;
	}
	
	public String getUsername()
	{
		return userName;
	}
	public String getpassword()
	{
		return password;
	}

	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
