package com.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Iterator;
import java.util.List;

public class Employee2Main {
    public static void main(String[] args) {

        Session session=HibernateConfiguration.getSessionFactory().openSession();
        Transaction t=session.beginTransaction();
       Query query=session.createQuery("from Employee2 e");
        //Query query=session.createQuery("select e.id,e.firstName,e.lastName from Employee2 e");
        //Query query=session.createQuery("from Employee2 e where e.id=?1");
       // Query query=session.createQuery("from Employee2 e where e.id in(?1,?2)");
        //query.setParameter(1,3);
       // query.setParameter(2,5);

        List result=query.getResultList();
        Iterator it = result.iterator();

        while (it.hasNext()) {
            //Employee2 e=it.next();
           // System.out.println(e.getId()+"   "+e.getFirstName()+"  "+e.getLastName());
            Employee2 e = (Employee2)it.next();
            System.out.println(e.getId()+"   "+e.getFirstName()+"  "+e.getLastName());
           // Object []o=(Object[]) it.next();
           // System.out.println(o[0]+"  "+o[1]+"  "+o[2]);
           //Employee2 e=(Employee2)it.next();
           // System.out.println(e.getId()+"   "+e.getFirstName()+"  "+e.getLastName());
        }
        t.commit();

       // Factory.close();
        session.close();





    }

}