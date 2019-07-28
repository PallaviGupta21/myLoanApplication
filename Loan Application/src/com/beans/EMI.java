package com.beans;

public class EMI 
{
	private static int EmiIdSeries=1;
	
		private double EmiAmt;
		private int EmiId;
		private float RateOfIntrest=8.50f;
		
				
		
		@Override
		public String toString() {
			return "EMI [EmiAmt=" + EmiAmt + ", EmiId=" + EmiId + ", RateOfIntrest=" + RateOfIntrest + "]";
		}

		public EMI()
		{			
			EmiId = EmiIdSeries;
			EmiIdSeries++;	
		}				
		
		/*public EMI(double emiAmt, int emiId, float rateOfIntrest) 
		{
			EmiAmt = emiAmt;
			EmiId = emiId;
			RateOfIntrest = rateOfIntrest;
		}*/

		public double getEmiAmt() {
			return EmiAmt;
		}

		public void setEmiAmt(double emiAmt) {
			EmiAmt = emiAmt;
		}

		public int getEmiId() {
			return EmiId;
		}

		public void setEmiId(int emiId) {
			EmiId = emiId;
		}

		public float getRateOfIntrest() {
			return RateOfIntrest;
		}

		public void setRateOfIntrest(float rateOfIntrest) {
			RateOfIntrest = rateOfIntrest;
		}



		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			long temp;
			temp = Double.doubleToLongBits(EmiAmt);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + EmiId;
			result = prime * result + Float.floatToIntBits(RateOfIntrest);
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
			EMI other = (EMI) obj;
			if (Double.doubleToLongBits(EmiAmt) != Double.doubleToLongBits(other.EmiAmt))
				return false;
			if (EmiId != other.EmiId)
				return false;
			if (Float.floatToIntBits(RateOfIntrest) != Float.floatToIntBits(other.RateOfIntrest))
				return false;
			return true;
		}
	
}
