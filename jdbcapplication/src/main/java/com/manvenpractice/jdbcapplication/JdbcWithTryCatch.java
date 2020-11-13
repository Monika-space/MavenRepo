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
		Statement st = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sql query you want to execute");
		Boolean result = st.execute(sc.nextLine());
		System.out.println("query result is "+result);
		ResultSet rs=st.getResultSet();
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"...."+rs.getString(2));	
		}
		con.close();
		
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

