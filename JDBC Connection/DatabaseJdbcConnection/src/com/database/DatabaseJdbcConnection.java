package com.database;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DatabaseJdbcConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		String username="root";
		String password="root";
		String url="jdbc:mysql://localhost:3306/dell";
		
		Connection con = (Connection) DriverManager.getConnection(url, username,password);
		if(con!=null)
			System.out.println("Connection established");
		Statement st =(Statement) con.createStatement();
		int x =st.executeUpdate("insert into product values(10,'Hp',53000,'Hyderabad')");
		if(x!=0)
			System.out.println("Record inserted");
		int y =st.executeUpdate("update product set price=54000 where pid=108 ");
		if(y!=0)
			System.out.println("Record updated");
		int z =st.executeUpdate("delete from product where pid=102 ");
		if(z!=0)
			System.out.println("Record updated");
		
		}
		
	
	}
	
	


