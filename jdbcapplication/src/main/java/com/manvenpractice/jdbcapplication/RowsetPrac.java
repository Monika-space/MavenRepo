package com.manvenpractice.jdbcapplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.*;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;
public class RowsetPrac {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","monika","luckky16");
		Statement st = con.createStatement();
		RowSetFactory rsf = RowSetProvider.newFactory();
		
		
		

	}

}
