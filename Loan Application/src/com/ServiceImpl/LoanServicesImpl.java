package com.ServiceImpl;

import com.beans.LoanAccount;
import com.exeception.EmiPaymentException;
import com.exeception.InvalidAccountNoException;
import com.exeception.InvalidEmiIdException;
import com.beans.Customer;
import com.beans.EMI;
import com.services.Service;

public class LoanServicesImpl implements Service
{
		LoanAccount acc;
		Customer c;
		EMI e;
		
		
		public int register(String CustName,String Occup,float Sal,int age, String Add)
		{
			c = new Customer(CustName,Occup,Sal,age, Add);
			//c.setCustomer(c.getcustName(),c.getoccup(),c.getsal(),c.getage(),c.getadd());
			//insertCreatedAccount();           //Dao services		
			return c.getCustId();
		}
		
		/*
		acc.setBrac(new Branch("Katraj","ktj",1901));
			acc.setDate(new Date(8,04,2019));
			*/
		
		public boolean accNoCheck(int a)throws InvalidAccountNoException 
		{
			acc=new LoanAccount();
		    //System.out.println(acc.getLoanAccNo());
			if(acc.getLoanAccNo()==a)
			{
				return true;
			}
			 return false;
		}
		
		//FUNCTION TO APPLY FOR LOAN
		public boolean applyLoan()throws InvalidAccountNoException
		{		
			    //System.out.println("emi id:"+e.getEmiId());
				System.out.println(" Your emi Id : 1");
				if(c.getAge()>=21 && c.getSal()>=10000)
			    {
					//System.out.println(" Emi Id : "+e.getEmiId());
					return true;
			    }
				else
				{					
					System.out.println(" Age is Not Greater than 21  OR  Salary is Not Greater than 10000 ");
				}
			return false;
		}
		
		
		
		// FUNCTION TO CHECK FOR CORRECT EMI ID
		public Boolean emiIdCheck(int id)throws InvalidEmiIdException
		{
			
			System.out.println(id);
			    e=new EMI();
				if(e.getEmiId()== id)
				{
					return true;
				}
			return false;
			
		}
		
		
		// FUNCTION TO CALULATE EMI PER MONTH
		public double emiCal()throws InvalidAccountNoException
		{
			e=new EMI();
			double interest=8.50/(12*100);										//interest for a month
			double emiAmt=(50000*interest*Math.pow(1+interest,10))/(Math.pow(1+interest,10)-1);
			e.setEmiAmt(emiAmt);
				
			return (e.getEmiAmt());
		}
		
		// FUNCTION TO CHECK FOR PAYMENT
		public Boolean emiPayment(double emi)throws EmiPaymentException
		{
			acc=new LoanAccount(30000);
			if(acc.getLoanAmt()>=emi)
			{
				acc.setLoanAmt((acc.getLoanAmt())-emi);
				System.out.println("Remaing Loan amt is  "+acc.getLoanAmt());
				System.out.println("emi id is : "+e.getEmiId());
				return true;
			}
			return false;
			
		}
		
		
		// FUNCTION TO ENQUIRE FOR BALANCE
		public void balEnq(int lndt)throws InvalidAccountNoException 
		 {
			 if(acc.getLoanAccNo()==lndt)
			 {
				 System.out.println(acc); 
			}
		 }
		
				
}

