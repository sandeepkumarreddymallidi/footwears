package com.postgresql.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PostgresqlExample {
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost/postgres";
		Connection conn=DriverManager.getConnection(url,"postgres","root");
		if(conn!=null)
		{
			System.out.println("connection established");
		}
		else {
			System.out.println("connection not established");
		}
		return conn;
	}
	public String  createOperation(String query,Connection connection) throws SQLException{
		PreparedStatement st=connection.prepareStatement(query);
		st.executeUpdate();
		return "table created";
	}
	public String   insertOperation(String query,Connection connection,int id,String name,int age,String dept) throws SQLException{
		PreparedStatement st=connection.prepareStatement(query);
		st.setInt(1,id);
		st.setString(2, name);
		st.setInt(3, age);
		st.setString(4, dept);
		System.out.println(query);
		st.executeUpdate();
		return "values inserted ";
	}
	public String  updateOperation(String query,Connection connection,String ename,int id) throws SQLException{
		PreparedStatement st=connection.prepareStatement(query);
		st.setString(1, ename);
		st.setInt(2,id);
		
		System.out.println(id);
		
		st.executeUpdate();
		return "values updated";
	}
	public ResultSet selectOperation(String query,Connection connection) throws SQLException {
		PreparedStatement st=connection.prepareStatement(query);
		ResultSet rs=st.executeQuery();
		return rs;
		
	}

	
	

}
