package com.hydernate.org;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("hyber.xml");
		SessionFactory sf=cf.buildSessionFactory();
	Session se=sf.openSession();
	Transaction ts=se.beginTransaction();
	Students sandeep=new Students();
	sandeep.setSid(105);
	sandeep.setName("ravi kumar");
	sandeep.setMarks(98);
	se.save(sandeep);
	ts.commit();
	se.close();
	
	}

}
