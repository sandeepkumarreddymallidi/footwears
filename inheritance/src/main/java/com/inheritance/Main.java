package com.inheritance;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session=HibernateClass.getSessionFactory().openSession();
        Transaction t=session.beginTransaction();
        P_Employee prnt=new P_Employee();
        prnt.setSalary(10452.00);
        prnt.setAge(30);
        prnt.setName("virat");
        session.save(prnt);
        T_Employee temp=new T_Employee();
        temp.setAge(38);
        temp.setName("dhoni");
        temp.setDuration(8.00);
        temp.setHourlyRate(1200.00);
        session.save(temp);

        t.commit();
        session.close();

    }
}
