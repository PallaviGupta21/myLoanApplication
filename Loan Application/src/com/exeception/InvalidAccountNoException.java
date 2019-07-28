package com.exeception;

public class InvalidAccountNoException  extends Exception
{
		 
		private String msg;

		public InvalidAccountNoException(String msg)
		{
						this.msg = msg;
		}

		@Override
		public String toString()
		{
			return "InvalidAccountNoException [msg=" + msg + "]";
		}
		
}
