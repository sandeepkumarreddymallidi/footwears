<%@page import="com.task6.org.*" %>
<%@ page import="java.sql.*" %>
<%@page import="java.util.Date.*" %>
<% 
long num=.parseInt(request.getParameter("num"));
Connection conn=DbConnection.getConnection();
PreparedStatement ps=conn.prepareStatement("insert into val values(?)");
ps.setLong(1, num);
int i=ps.executeUpdate();
if(i!=0)
{
	out.println("success");
}
%>