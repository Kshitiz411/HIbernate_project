      package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        
  System.out.println("project started");
  
 // SessionFactory factory = new Configuration().configure().buildSessionFactory();
  Configuration cfg = new Configuration();
  cfg.configure("hibernate.cfg.xml");
  SessionFactory factory =cfg.buildSessionFactory();
  
  
  //System.out.println(factory);
 // System.out.println(factory.isClosed());
  
  //creating student
  Student  st = new Student();
  st.setId(106);
  st.setName("Archana"); 
  st.setAddress("Birgunj");
  System.out.println(st);
  
   Session session = factory.openSession();
    Transaction tx = session.beginTransaction();
   session.save(st);
   
   tx.commit();
   
   session.close();
    } 
}
