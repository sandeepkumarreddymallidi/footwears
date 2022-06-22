package com.footwear.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FootwearExample
 */
@WebServlet("/FootwearExample")
public class FootwearExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FootwearExample() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		long mobile=Integer.parseInt(request.getParameter("mobile"));
		String gender=request.getParameter("gender");
		String dob=request.getParameter("dob");
		String address=request.getParameter("address");
		Connection conn=null;
		PreparedStatement ps=null;
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sandeep","root","root");
			}
			catch(Exception e) {
			e.printStackTrace();
			}

		
			ps=conn.prepareStatement("insert into footwear2((name,email,phonenumber,gender,dob,address)) values(?,?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,email);
			ps.setLong(3,mobile);
			ps.setString(4,gender);
			ps.setString(5,dob);
			ps.setString(6,address);
			ps.executeUpdate();
			
			PrintWriter pw=response.getWriter();
			pw.println("<html><body bgcolor='wheat'><h1 align='center'>");
			pw.println("registered successfully");
			pw.println("</h1><body><html>");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
