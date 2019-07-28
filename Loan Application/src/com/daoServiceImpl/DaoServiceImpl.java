package com.daoServiceImpl;

import com.connectivity.JDBCArch;

public class DaoServiceImpl
{
	/*
	public void executeSelect(){
		try{
			
			rs=stmt.executeQuery("select * from LoanAccount  ");
			while(rs.next())
			{
				int accNo=rs.getInt(1);
				Date date=rs.getDate(2);
				Branch brac=rs.getBranch(3);
				
				System.out.println(" account no : "+accNo);
				System.out.println("account date : "+date);
				System.out.println("account Branch: "+brac);
			}
			
		 }
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
		
		
	public void executeUpdate()
	{
		int updateCnt=0;
		
		try{
			updateCnt=stmt.executeUpdate("insert into Account value(101,'saving',1000.80)");
			System.out.println(updateCnt+"no. of record updated.");
			}
			catch(Exception e)
			{
			  e.printStackTrace();
	 		}
	
			}
			catch(Exception e)
			{
			     e.printStackTree();
			}

	*/
	public static void main(String[] args)
	{
		JDBCArch architecture= new JDBCArch ();
		architecture.connect();
		//architecture.executeSelect();
		//architecture.executeUpdate();
		
	}

}
