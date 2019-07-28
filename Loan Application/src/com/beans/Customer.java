package com.beans;

public class Customer 
{
	private int custId;
	private String custName;
	private String occup;
	private float sal;
	private String add;
	private int age;
	
	private static int custIdSeries=100;
	
	

	public Customer()
	{
		//default constrctor
	}
	
	//parameterise  constructor
	public Customer( String custName, String occup, float sal, int age, String add) {
		
		this.custId = custIdSeries;
		custIdSeries++;
		
		this.custName = custName;
		this.occup = occup;
		this.sal = sal;
		this.add = add;
		this.age = age;
	}
	
	//getter setter
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getOccup() {
		return occup;
	}

	public void setOccup(String occup) {
		this.occup = occup;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", occup=" + occup + ", sal=" + sal + ", add="
				+ add + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((add == null) ? 0 : add.hashCode());
		result = prime * result + age;
		result = prime * result + custId;
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		result = prime * result + ((occup == null) ? 0 : occup.hashCode());
		result = prime * result + Float.floatToIntBits(sal);
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
		Customer other = (Customer) obj;
		if (add == null) {
			if (other.add != null)
				return false;
		} else if (!add.equals(other.add))
			return false;
		if (age != other.age)
			return false;
		if (custId != other.custId)
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		if (occup == null) {
			if (other.occup != null)
				return false;
		} else if (!occup.equals(other.occup))
			return false;
		if (Float.floatToIntBits(sal) != Float.floatToIntBits(other.sal))
			return false;
		return true;
	}
	
}
