package com.exeception;

public class EmiPaymentException extends Exception
{
	private String msg;

	public EmiPaymentException(String msg) 
	{
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "EmiPaymentException [msg=" + msg + "]";
	}

	
}
