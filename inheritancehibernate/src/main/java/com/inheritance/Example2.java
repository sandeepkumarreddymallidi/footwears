package com.inheritance;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class Example2 {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                StandardServiceRegistry ssr = PropertyExample.getProperties();
                sessionFactory = new MetadataSources(ssr).addAnnotatedClass(Employee2.class).getMetadataBuilder().build().buildSessionFactory();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
            return sessionFactory;
        }
}
