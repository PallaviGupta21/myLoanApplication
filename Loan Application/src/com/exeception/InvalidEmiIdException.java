package com.exeception;

public class InvalidEmiIdException extends Exception
{
	private String msg;

	
	public InvalidEmiIdException(String msg) 
	{
		
		this.msg = msg;
	}


	@Override
	public String toString()
	{
		return "InvalidEmiIdException [msg=" + msg + "]";
	}
	
	

}
