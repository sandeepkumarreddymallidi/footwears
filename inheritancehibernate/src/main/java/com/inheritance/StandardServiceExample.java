package com.inheritance;

import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class StandardServiceExample {
    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                StandardServiceRegistryBuilder ssr = new StandardServiceRegistryBuilder();
                Properties setting = new Properties();
                setting.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
                setting.put(Environment.URL, "jdbc:mysql://localhost:3306/sandeep");
                setting.put(Environment.USER, "root");
                setting.put(Environment.PASS, "root");
                setting.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
                setting.put(Environment.SHOW_SQL, "true");
                setting.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
                setting.put(Environment.HBM2DDL_AUTO, "update");
                ssr.applySettings(setting);
                StandardServiceRegistry ss=ssr.build();
                MetadataSources meta=new MetadataSources(ss);
                meta.addAnnotatedClass(Employee2.class);
               Metadata data=meta.getMetadataBuilder().build();
               sessionFactory= data.buildSessionFactory();

            }
            catch (Exception e){
                e.printStackTrace();

            }
            }
            return sessionFactory;
            }
}
