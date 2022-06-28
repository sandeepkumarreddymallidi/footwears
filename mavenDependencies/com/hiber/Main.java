package com.hiber;

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
        Student san=new Student(106,"mahesh kumar","IT");

        se.save(san);
        ts.commit();
        se.close();

    }
}
