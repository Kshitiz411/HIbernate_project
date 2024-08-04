package com.hibernate.Mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Connection {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		  cfg.configure("hibernate.cfg2.xml");
		  SessionFactory factory =cfg.buildSessionFactory();
		  
		student student1 =new student();
		student1.setId(236);
		student1.setName("kshitiz chaudhary");
		student1.setAddress("kathmandu");
		
		Certificate certificate = new Certificate();
		certificate.setCourse("Android");
		certificate.setDuration("2 months");
		student1.setCerti(certificate);
		
		student student2 =new student();
		student2.setId(237);
		student2.setName("Archana chaudhary");
		student2.setAddress("Birgunj");
		
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("Hibernate");
		certificate1.setDuration("1.5 months");
		student2.setCerti(certificate1);
		
		student student3 =new student();
		student3.setId(238);
		student3.setName("Sunil Lamichhane");
		student3.setAddress("Pokhara");
		
		Certificate certificate2 = new Certificate();
		certificate2.setCourse("Python");
		certificate2.setDuration("2.5 months");
		student3.setCerti(certificate2);
		
		student student4 =new student();
		student4.setId(240);
		student4.setName("Sunil Lamichhane");
		student4.setAddress("Pokhara");
		
		Certificate certificate3 = new Certificate();
		certificate3.setCourse("Merr");
		certificate3.setDuration("2.5 months");
		student4.setCerti(certificate3);
		
		Session  s = factory.openSession();
		 Transaction tx = s.beginTransaction();
		 // object save:
		 
		 s.save(student1);
		 s.save(student2);
		 s.save(student3);
		 s.save(student4);
		
		tx.commit();
		s.close();
		factory.close();
		
		
	}

}
