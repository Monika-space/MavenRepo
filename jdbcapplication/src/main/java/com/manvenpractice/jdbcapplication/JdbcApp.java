package com.manvenpractice.jdbcapplication;
import java.sql.*;
public class JdbcApp 
{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       Class.forName("oracle.jdbc.OracleDriver");
       Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","monika","luckky16");
       Statement st = con.createStatement();
       if(con==null)
       {
    	   System.out.println("not connected to oracle DB");
       }
       else
       {
    	   System.out.println("connected to oracle DB");
       }
       ResultSet rs = st.executeQuery("select * from Employee");
       while(rs.next()) 
       {
    	System.out.println(rs.getString(1)+"---"+rs.getString(2));   
       }
       con.close();
       
	}
}
