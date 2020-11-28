package com.manvenpractice.jdbcapplication;
import java.sql.*;
public class ResultSetMetaDataPrac 
{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.OracleDriver");
	       Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","monika","luckky16");
	       Statement st = con.createStatement();
	       ResultSet rs = st.executeQuery("select * from EMPLOYEE");
	       ResultSetMetaData rsm = rs.getMetaData();
	       String Table_name=rsm.getTableName(1);
	       System.out.println("Name of the table : "+Table_name);
	       int column_count=rsm.getColumnCount();
	       System.out.println("No of columns in the Employee table is : "+column_count);
	       System.out.println("Below are the columns of Employee table");
	       for(int i=1;i<=column_count;i++)
	       {
	       //String column_name=;
	       System.out.println("column Name : "+rsm.getColumnName(i));
	       System.out.println("column type : "+rsm.getColumnTypeName(i));
	       System.out.println();
	       System.out.println("***********");
	       }
	       con.close();
	}

}
