package com.manvenpractice.jdbcapplication;
import java.sql.*;
public class JdbcApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       Class.forName("oracle.jdbc.OracleDriver");
       Connection con = DriverManager.getConnection(url, user, password);
       Statement st = con.createStatement();
       ResultSet rs = st.executeQuery("select * from Employee");
       con.close();
	}

}
