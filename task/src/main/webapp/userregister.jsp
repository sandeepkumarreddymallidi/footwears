<%@ page import="java.sql.*" %>
<%@ page import="com.task.org.*"%>
<%  
    String ename=request.getParameter("name");
    String eemail=request.getParameter("email");
    String epassword=request.getParameter("password");
     String dob=request.getParameter("dob");
  	Connection conn=DbConnection.getConnection();
  	PreparedStatement ps=conn.prepareStatement("insert into userregister1 values(?,?,?,?)");
  	ps.setString(1, ename);
  	ps.setString(2, eemail);
  	ps.setString(3, epassword);
  	ps.setString(4, dob);
  	ps.executeUpdate();
  	out.println("success");
  	%>
  	
  	