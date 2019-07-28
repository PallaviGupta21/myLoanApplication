package com.services;

import com.exeception.EmiPaymentException;
//import com.ServiceImpl.InvalidAccountNoException;
import com.exeception.InvalidAccountNoException;
import com.exeception.InvalidEmiIdException;

public interface Service 
{
	     public int register(String CustName,String Occup,float Sal,int age, String Add);
	     public boolean applyLoan()throws InvalidAccountNoException;
	     double emiCal()throws InvalidAccountNoException;
		 Boolean emiPayment(double emi ) throws EmiPaymentException;
		 void balEnq(int lndt)throws InvalidAccountNoException;
		public boolean accNoCheck(int lndt)throws InvalidAccountNoException;
		public Boolean emiIdCheck(int emiId) throws InvalidEmiIdException; 
		

	
}
