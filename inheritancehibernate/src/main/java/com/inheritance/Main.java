package com.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration cf=new Configuration();
        cf.configure("hibernate.xml");
        SessionFactory sf=cf.buildSessionFactory();
        Session se=sf.openSession();
        Transaction ts=se.beginTransaction();
        CreditCard c=new CreditCard();
        c.setPid(101);
        c.setCcType("master");
        c.setAmount(10404);
        se.save(c);
        Cheque cq=new Cheque();
        cq.setPid(102);
        cq.setCqType("icici");
        cq.setAmount(10000);
        se.save(cq);
        ts.commit();
        se.close();
    }
}
