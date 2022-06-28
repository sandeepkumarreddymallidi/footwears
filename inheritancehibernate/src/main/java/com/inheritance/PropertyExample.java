package com.inheritance;

import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class PropertyExample {
    private static Properties setting;
    public static StandardServiceRegistry getProperties(){
        try {
             setting = new Properties();
            setting.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            setting.put(Environment.URL, "jdbc:mysql://localhost:3306/sandeep");
            setting.put(Environment.USER, "root");
            setting.put(Environment.PASS, "root");
            setting.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
            setting.put(Environment.SHOW_SQL, "true");
            setting.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
            setting.put(Environment.HBM2DDL_AUTO, "update");

        }
        catch(Exception e) {
            e.printStackTrace();
        }
       return new StandardServiceRegistryBuilder().applySettings(setting).build();
    }

}
