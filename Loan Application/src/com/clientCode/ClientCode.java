package com.clientCode;
import java.util.Scanner;
import com.beans.*;
import com.ServiceImpl.LoanServicesImpl;
import com.exeception.Eligibility;
import com.exeception.EmiPaymentException;
import com.exeception.InvalidAccountNoException;
import com.exeception.InvalidEmiIdException;
import com.provider.BussinessObjectProvider;
import com.services.Service;
public class ClientCode
{
	public static void main(String[] args)  
	{
		Scanner sc=new Scanner(System.in);     //taking run time input from console
		Service s=BussinessObjectProvider.provideObj();  // reference to object
		
		 do // looping of menu
		 {
			System.out.println("\n\n** commited on git **");
    		 System.out.println("\n\n**************** CAR LOAN SERVICES ****************");
			 System.out.println("----------MENU---------\n1.Register(first register)\n2.Apply for Loan\n"
			 		+ "3.EMI details(check details before payments)\n4.EMI Payment\n5.Balance Enqiry\n6.Exit\n-----------------------");
			 System.out.println("ENTER YOUR CHOICE : ");
			 int ch=sc.nextInt();
			 switch(ch)
			 {
			 
			 	case 1: System.out.print("Enter Name: ");
			 			String n=sc.next();
			 			System.out.println("Enter Your Occupation: ");
			 			String o=sc.next();
			 			System.out.println("Enter Your Salary: ");
			 			Float sa=sc.nextFloat();
			 			System.out.println("Enter Your Age: ");
			 			int a=sc.nextInt();
			 			System.out.println("Enter Your Address : "); 
			 			String ad=sc.next();
			 			int acNo=s.register(n,o, sa,a,ad);  // register function call
			 			
			 			System.out.println("Welcome To Your New Account \n Your Account no: "+acNo);
			 			System.out.println("----------- XXX ------------");
			 			break;
			 			
			 	case 2: System.out.println("Enter your Account No : ");
			 	        int Ac=sc.nextInt();
			 	        try{
			 	        	Boolean chk=s.accNoCheck(Ac);
			 	        	if(chk==true)
			 	        	{
			 	        			System.out.println("@ Your Loan Acount No : "+Ac+"\n (NOTE: Remeber Your Loan Account No.)");
			 	        
			 	        			Boolean recv=s.applyLoan();
			 	        			try{
			 	        			    if(recv==true)
			 	        			    {		       			    	
			 	        			    	System.out.println("\n !!!!! Congoooo!!!!! \n Recevied loan amount of 30,000");
			 	        			    				 	        			  
			 	        			    }
			 	        			    else{
			 	        			    		throw new Eligibility("SORRY, Not eligible for Loan");
			 	        			 	
			 	        			   }
			 	        			}catch(Eligibility e)
			 			 	        {
						 				e.printStackTrace();
						 	        }
			 	        			
			 	        	}
			 	        	else
			 	        	{
			 	        		throw new InvalidAccountNoException("Please Enter Correct Account No !!!");
	 	          			}
			 	         }
			 	        catch(InvalidAccountNoException e)
			 	         {
			 				e.printStackTrace();
			 	         }
			 	        System.out.println("\n--------------- XXX ----------------");
			 			
			 	       break;
			 			
			 	case 3: System.out.println(" Enter your EMI ID : ");
			 	        int emId=sc.nextInt();
			 	        
			 	        try{
			 	        	Boolean chk=s.emiIdCheck(emId);
			 	        	if(chk==true)
			 	        	{
			 	        		System.out.println("\n Rate of intrest monthly is 8.50.");
			 	        		System.out.println("As Per Your Age you are eligible for taking loan for 10 years Only.");
			 	        		
			 	        		double emi=s.emiCal();
			 	        		System.out.println("\n According to Norms.... \n You are Expected to Pay Monthly : "+emi);
			 	        		
			 	        	}
			 	           }
			 	        catch(InvalidEmiIdException e)
			 	        {
			 	        	e.printStackTrace();
			 	        } 
			 	        catch (InvalidAccountNoException e)
			 	        {
							e.printStackTrace();
						}
			 	        System.out.println("\n----------------- XXX -----------------");

			 	        break;
			 	        
			 
			
			  case 4:	System.out.println("Enter Your EMI ID : ");
			  			int emiId=sc.nextInt();
			  			
			  			 try{		
			  				 Boolean chkEmi=s.emiIdCheck(emiId);
			  				 System.out.println("chk: "+chkEmi);
				           		if(chkEmi==true)
				           		{
				           			try{
				 	        			   Boolean paid=s.emiPayment(emiId);
				 	        			   if(paid==true)
				 	        			   {
				 	        				   System.out.println("Payment Done Successfully!!!! ");
				 	        			   }
				 	        			   else
				 	        			   {
				 	        				   throw new EmiPaymentException ("Payment Not Done.....");
				 	        			   }
				 	          		   }
				           				catch(EmiPaymentException e)
				           				{
				           					e.printStackTrace();
				           				}	
				           		}
				           		else
				           		{
				           			throw new InvalidEmiIdException("Please Enter Correct EMI ID No !!!");
				           		}
			  			 	} 
			  			 	catch(InvalidEmiIdException e)
			  			 	{
				      		   e.printStackTrace();
			  			 	}
			  			 	System.out.println("\n------------------- XXX ------------------");

				  		     break;
				  		     
			       case 5:  System.out.println("Your Loan account details are:- ");
			       			System.out.println(" Enter your Account No : ");
			       			int lndt=sc.nextInt();
	           
			       			try{		
			       					Boolean chk2=s.accNoCheck(lndt);
			       					if(chk2==true)
			       					{
			       						s.balEnq(lndt);
			       					}
			       					else
			       					{
			       						throw new InvalidAccountNoException("Please Enter Correct Account No !!!");
			       					}
			       			   }
			       			   catch(InvalidAccountNoException e)
			       			   {
			       				   e.printStackTrace();
			       			   }
			       				System.out.println("\n---------------- XXX  ------------------");

			       				break;
			       				
			      case 6: System.out.println("********** THANKS TO VIST **********");
			      		  System.exit(0);
			 	        
			       }
			 
		 }while(true);
	}
}
