package com.jdbcconnection.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
class ConnectionExample{
	public  Connection getConnection() throws ClassNotFoundException, SQLException
	{
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sandeep","root","root");
		return connection;
	}
	
}
