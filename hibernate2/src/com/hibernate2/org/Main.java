package com.hibernate2.org;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Main {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hyber2.xml");
		SessionFactory ssr=con.buildSessionFactory();
		Session se=ssr.openSession();
		
		

	}

}
