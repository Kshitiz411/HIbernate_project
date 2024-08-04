package com.hibernate.one2one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Controls {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		  cfg.configure("hibernate.cfg.xml");
		  SessionFactory factory =cfg.buildSessionFactory();
		  
		  //creating question object
		 Question q1 = new Question();
		 q1.setQuestionId(123);
		 q1.setQuestion("what is java");
	
		 //creating answer object
		 
		  Answer answer = new Answer();
		  answer.setAnswerId(343);
		  answer.setAnswer("java is programming language");
		  answer.setQuestion(q1);
		  q1.setAnswer(answer);
		  
		  
		  
		  
		  Question q2 = new Question();
			 q2.setQuestionId(242);
			 q2.setQuestion("what is collection Frameweork");
		
			 //creating answer object
			 
			  Answer answer1 = new Answer();
			  answer1.setAnswerId(344);
			  answer1.setAnswer("API to work with object in java");
			  answer1.setQuestion(q2);
			  q2.setAnswer(answer1);
		  // session to save
		  Session  s = factory.openSession();
		  Transaction tx = s.beginTransaction();
		  
		  //save
		  
		  s.save(q1);
		  s.save(q2);
		  s.save(answer);
		  s.save(answer1);
		  
		  tx.commit();
		  
		  //fetching
		  Question newQ=(Question)s.get(Question.class,123);
		  System.out.println(newQ.getQuestion());
		  System.out.println(newQ.getAnswer().getAnswer());
		  s.close();
		  
		  factory.close();
	}

}
