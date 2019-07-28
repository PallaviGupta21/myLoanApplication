package com.daoServices;

import java.sql.SQLException;
import com.beans.Customer;
import com.beans.EMI;
import com.beans.LoanAccount;

public interface daoServicesInterface 
{
	void insertLoanAccount( Customer c) ;
	
	void selectLoanAccount( LoanAccount a);
	void selectEMI( EMI e);
	
	void updateQuery( LoanAccount a);
	
}
