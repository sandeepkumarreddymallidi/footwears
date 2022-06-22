<%@page import="com.task6.org.*" %>
<%@ page import="java.sql.*" %>
<%@page import="java.util.Date.*" %>
<% 
String fromd=request.getParameter("fromd");
String fromt=request.getParameter("tod");
int nod=Integer.parseInt(request.getParameter("num"));
Connection conn=DbConnection.getConnection();
PreparedStatement ps=conn.prepareStatement("insert into dates values(?,?,?)");
ps.setString(1, fromd);
ps.setString(2,fromt);
ps.setInt(3,nod);
int i=ps.executeUpdate();
if(i!=0)
{
	out.println("success");
}
%>
