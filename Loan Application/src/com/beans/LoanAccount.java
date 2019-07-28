package com.beans;


public class LoanAccount
{
		
	   static  private int accNoSeries=100;
		 
		private int loanAccNo;
		private float accBal;
	    private int tenure=10;
	    private double loanAmt; 

		
		//dependencies-has a 
	    private Customer cust;
		
		

	    public LoanAccount( Customer cust) {
	    	
			this.loanAccNo =accNoSeries ;
	    	accNoSeries++;
	    	
			this.cust = cust;
			
		}
	   
	    public LoanAccount()
	    {
	    	this.loanAccNo= accNoSeries ;
	    	accNoSeries++;
	    }
		public Customer getCust() {
			return cust;
		}

		public void setCust(Customer cust) {
			this.cust = cust;
		}
	
		public int getLoanAccNo() {
			return loanAccNo;
		}

		public void setLoanAccNo(int loanAccNo) {
			this.loanAccNo = loanAccNo;
		}

		public float getAccBal() {
			return accBal;
		}

		public void setAccBal(float accBal) {
			this.accBal = accBal;
		}

		public int getTenure() {
			return tenure;
		}

		public void setTenure(int tenure) {
			this.tenure = tenure;
		}

		public double getLoanAmt() {
			return loanAmt;
		}

		public void setLoanAmt( double d) {
			this.loanAmt = d;
		}

		
		public LoanAccount(double loanAmt){
			this.loanAmt =loanAmt;
		}

		@Override
		public String toString() {
			return "LoanAccount [loanAccNo=" + loanAccNo + ", accBal=" + accBal + ", tenure=" + tenure + ", loanAmt="
					+ loanAmt + ", cust=" + cust ;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + Float.floatToIntBits(accBal);
			result = prime * result + ((cust == null) ? 0 : cust.hashCode());
			result = prime * result + loanAccNo;
			long temp;
			temp = Double.doubleToLongBits(loanAmt);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + tenure;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			LoanAccount other = (LoanAccount) obj;
			if (Float.floatToIntBits(accBal) != Float.floatToIntBits(other.accBal))
				return false;
			if (cust == null) {
				if (other.cust != null)
					return false;
			} else if (!cust.equals(other.cust))
				return false;
			if (loanAccNo != other.loanAccNo)
				return false;
			if (Double.doubleToLongBits(loanAmt) != Double.doubleToLongBits(other.loanAmt))
				return false;
			if (tenure != other.tenure)
				return false;
			return true;
		}

		
		

				
	
}

