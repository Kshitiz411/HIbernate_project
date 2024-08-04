package com.hibernate.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;





public class queries {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		  cfg.configure("hibernate.cfg2.xml");
		  SessionFactory factory =cfg.buildSessionFactory();
		  
		  Session s = factory.openSession();		 //HQL
		  //Syntax
		  
		  
		  //String query = "from student where address =  :x";
	//String query = "from student as s where s.address = :x and s.name =:n";
	//	  Query q =s.createQuery(query);
		  
		  
	//	 q.setParameter("x", "Pokhara");
	//	 q.setParameter("n","Sunil Lamichhane");
		  //single-unique
		  //multiple-list
		  
		// List<student> list=q.list();
		 // for(student student:list) {
			  
		//	  System.out.println(student.getName()+" : "+student.getCerti().getCourse());
		//  }  
		  
		 //delete
		  //System.out.println("___________________________");
		  
		 // Transaction tx = s.beginTransaction();
		//  Query q2= s.createQuery("delete from student  s where  s.address =:c");
		  
		// q2.setParameter("c","Birgunj");
		 // int r = q2.executeUpdate();
		
		 //System.out.println("the student is deleted");
		 //System.out.println(r);
		 
		 // tx.commit();
		  
		  //update
		  
		  //System.out.println("____________ _______");
		  
		  //Transaction tx = s.beginTransaction();
		 //Query q3= s.createQuery("update student set address = :c where name = :n");
		 // q3.setParameter("c","Butwal");
		 // q3.setParameter("n", "Sunil Lamichhane");
		   // int r = q3.executeUpdate();
		   // System.out.println(r+" objects updated");
		  
		  //tx.commit();
		  
		  // how to execute join query 
		  Query q4= s.createQuery("select q.question,q.questionId,a.answer from Question as q INNER JOIN q.answers as a");
		  
		  List<Object[]> list = q4.getResultList();
		  for(Object[] arr : list) {
			  System.out.println(Arrays.toString(arr));
		  }
		  
		  s.close();
		  factory.close();
		
	}

}

