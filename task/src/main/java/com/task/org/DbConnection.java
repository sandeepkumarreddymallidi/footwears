package com.task.org;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection{
	static Connection conn=null;
	public static Connection getConnection() {
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/motivity","root","root");
		}
			catch(Exception e) {
			e.printStackTrace();
			}
		return conn;
	}

		
	}

