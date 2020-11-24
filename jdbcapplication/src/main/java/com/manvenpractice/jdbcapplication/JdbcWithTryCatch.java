package com.manvenpractice.jdbcapplication;
import java.sql.*;
import java.util.*;

public class JdbcWithTryCatch {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","monika","luckky16");
		try
		{
		
		if(con!=null)
		{
			System.out.println("oracle DB connection created");
		}
		else
		{
			System.out.println("connection not successful, pls review your code again!!");
		}
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the sql query you want to execute");
		int update_result =st.executeUpdate("update Employee set emp_id='MA5037876' where emp_name='Monika'");
		System.out.println("update query result is "+update_result);
		System.out.println("Enter the sql query you want to execute");
		Boolean select_result = st.execute(sc.nextLine());
		System.out.println("select query result is "+select_result);
		ResultSet rs=st.getResultSet();
		while(rs.next())
		{
		//rs.absolute(2);
		System.out.println(rs.getString(1)+"...."+rs.getString(2));	
		}
		//con.close();
		
	}
		finally
		{
	     con.close();
	     if (con.isClosed())
	     {
	    	 System.out.println("connection closed");
	     }
	    	 else
	    	 {
	    		 System.out.println("connection is not closed");
	    	 }
	     
		}
			
	}
}

