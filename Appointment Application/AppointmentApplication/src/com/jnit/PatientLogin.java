package com.jnit;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PatientLogin extends HttpServlet {
	Connection con = null;
	PreparedStatement ps=null;
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/dell";
			String user="root";
			String pass ="root";
			con= DriverManager.getConnection(url,user,pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		String username=request.getParameter("dname");
		String password=request.getParameter("password");
		System.out.println(username +" "+password);
		try {
			ps=con.prepareStatement("select * from patient where name=? and password=?");
			ps.setString(1,username);
		    ps.setString(2, password);
		    ResultSet rs=ps.executeQuery();
		    if(rs.next()) {
		    	response.sendRedirect("./patient_home.html");
		    	System.out.println("Reached");
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
