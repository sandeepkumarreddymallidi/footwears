package com.postgresql.org;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PostgresqlExample stdo=new PostgresqlExample();
		Connection conn=stdo.getConnection();	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your option 1.create table,2.insert values,3.upadate values,4.retrive data");
		int x=sc.nextInt();	
			while(x<5&x!=0)
			{
				if(x==1) {
					String i=stdo.createOperation("create table employee10(eid integer,ename varchar(20),eage integer,edept varchar(20))", conn);
					System.out.println(i);
				}
				if(x==2) {
					int id=sc.nextInt();
					String name=sc.next();
					int age=sc.nextInt();
					String dept=sc.next();
					String i=stdo.insertOperation("insert into employee10 values(?,?,?,?)", conn,id,name,age,dept);
					System.out.println(i);
				}
				if(x==3) {
					
					String ename=sc.next();
					int id=sc.nextInt();
					String i=stdo.updateOperation("UPDATE employee10 SET ename=? WHERE eid=?", conn,ename,id);
					System.out.println(i);
				}
				if(x==4) {
					ResultSet rs1=stdo.selectOperation("SELECT *FROM employee10", conn);
					while(rs1.next()) {
						System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+" "+rs1.getString(4));
					}
				}
				
				System.out.println("enter 1.create table,2.insert values,3.upadate values,4.retrive data or press any number to exit");
				x=sc.nextInt();
		    }
			System.out.println("you are disconnected with database");
			conn.close();
			sc.close();

	}

}
