package com.aprendaefaca.aulahibernate.utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author rubens.leme
 */
public class HibernateUtil {

   // private static final SessionFactory sessionFactory;
    
    private static final SessionFactory sessionFactory = buildSessionFactory();  
  
    private static SessionFactory buildSessionFactory() {  
        try {  
            // Create the SessionFactory from hibernate.cfg.xml  
            return new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();  
        } catch (Throwable ex) {  
            // Make sure you log the exception, as it might be swallowed  
            System.err.println("Initial SessionFactory creation failed." + ex);  
            throw new ExceptionInInitializerError(ex);  
        }  
    }  
  
    public static SessionFactory getSessionFactory() {  
        return sessionFactory;  
    }  
}
