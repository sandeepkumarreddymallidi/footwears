package com.inheritance;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDao {
    public void saveEmployee(Employee2 employee){
        Transaction transaction=null;
        try(Session session=HibernateConfiguration.getSessionFactory().openSession()){
            transaction=session.beginTransaction();
            session.save(employee);
            transaction.commit();

        }
        catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    public List< Employee2 > getEmployee2() {
        try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
            return session.createQuery("from Employee2", Employee2.class).list();
        }
    }
}
