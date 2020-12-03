package com.manvenpractice.jdbcapplication;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStmtPrac {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","monika","luckky16");
		Scanner sc = new Scanner(System.in);
		System.out.println("Data from employee table");
		//sql=sc.nextLine();
		PreparedStatement ps1=con.prepareStatement("select * from Employee",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=ps1.executeQuery();
		while(rs.next())
		{
 		System.out.println(rs.getString(1)+"...."+rs.getString(2));	
		}
		System.out.println("inserting records to the employee table");
		PreparedStatement ps= con.prepareStatement("insert into Employee values(?,?)");
		System.out.println("How many records you want to insert");
		int ParameterIndex, count,i=1;
		count=sc.nextInt();
		String value;
		while(i<=count)
		{
	    ParameterIndex=1;
		System.out.println("enter employee id");
		value=sc.next();
		ps.setString(ParameterIndex, value);
		//ps.executeUpdate();
		System.out.println("enter employee name");
		value=sc.next();
		ParameterIndex=2;
		ps.setString(ParameterIndex, value);
		ps.executeUpdate();
		System.out.println(i+" record inserted");
		i++;
		}
		//ps1.execute();
		System.out.println("table updated with the inserted values");
		ResultSet rs1=ps1.executeQuery();
		//rs1.absolute(1);
		while(rs1.next())
		{
 		System.out.println(rs1.getString(1)+"...."+rs1.getString(2));	
		}
		con.close();

	}

}
