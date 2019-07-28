package com.ServiceImpl;

import com.beans.Login;

public class LoginImpl 
{

	public class Validate {
		
		private Login user;
		
		
		public Validate(Login user)
		{
			this.user=user;
		
			
		}
			
		public boolean validateData()
		{
			if(user.getUsername().equals("nayan") && user.getpassword().equals("nayyan"))
			{
				return true;
			}
			else
			{
				return false;
			}
    	}

	}
}
