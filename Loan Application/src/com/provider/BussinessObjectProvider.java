package com.provider;

import com.ServiceImpl.LoanServicesImpl;


public class BussinessObjectProvider
{
	
			public static LoanServicesImpl  a1;
			
			public static  LoanServicesImpl provideObj()
			{
				a1=new  LoanServicesImpl();
				return a1;
			}
	
}
