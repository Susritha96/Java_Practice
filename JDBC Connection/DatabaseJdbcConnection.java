package com.database;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
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
		PreparedStatement ps =(PreparedStatement) con.prepareStatement("delete from product where pid=?");
		ps.setInt(1,104);
		int x = ps.executeUpdate();
		if(x!=0)
			System.out.println("Record displayed");
		
		
				
		
		}
		
	
	}
	
	


