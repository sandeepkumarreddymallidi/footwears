package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class UserRegistration extends HttpServlet {
	Connection conn=null;
	PreparedStatement ps=null;
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/motivity","root","root");
		}
		catch(Exception e) {
		e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		String email=request.getParameter("email");
		try {
		ps=conn.prepareStatement("insert into sample1 values(?,?)");
		ps.setString(1,name);
		ps.setString(2,email);
		ps.executeUpdate();
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor='wheat'><h1 align='center'>");
		pw.println("registered successfully");
		pw.println("</h1><body><html>");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
