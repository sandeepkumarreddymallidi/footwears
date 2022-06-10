package com.jdbc.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementCrudOperation {
	Connection connection;
	public  Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sandeep","root","root");
		return connection;
	}
	public String  createOperation(String query,Connection connection) throws SQLException{
		Statement st=connection.createStatement();
		st.executeUpdate(query);
		return "table created";
	}
	public String   insertOperation(String query,Connection connection) throws SQLException{
		Statement st=connection.createStatement();
		st.executeUpdate(query);
		return "values inserted ";
	}
	public String  updateOperation(String query,Connection connection) throws SQLException{
		Statement st=connection.createStatement();
		st.executeUpdate(query);
		return "values updated";
	}
	public ResultSet selectOperation(String query,Connection connection) throws SQLException {
		Statement st=connection.createStatement();
		ResultSet rs=st.executeQuery(query);
		return rs;
		
	}
}
