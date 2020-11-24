package com.manvenpractice.jdbcapplication;
import java.sql.*;
public class JdbcType3Prac {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    Class.forName("ids.sql.IDSDriver");
    Connection con = DriverManager.getConnection("jdbc:ids://localhost:12/conn?dsn=sysdsntype3","monika","luckky16");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from employee");
    while(rs.next())
    {
      System.out.println(rs.getString(1)+"..."+rs.getString(2));	
    }
  }
}
