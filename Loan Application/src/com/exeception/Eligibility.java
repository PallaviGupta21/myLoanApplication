package com.exeception;

public class Eligibility extends Exception
{
	private String msg;

	public Eligibility(String msg) {
		// super();  // offer to object(super class)
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Eligibility [msg=" + msg + "]";
	}

	
}
