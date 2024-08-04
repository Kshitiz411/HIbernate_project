package com.hibernate.one2many;

    import java.util.ArrayList;
    import java.util.List;
    import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	
	
	public class MainControl {

	 
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
			 
			  Answer answer1 = new Answer();
			  answer1.setAnswerId(33);
			  answer1.setAnswer("With the help of java we can create softwares");
			  answer1.setQuestion(q1);
			  
			  Answer answer2 = new Answer();
			  answer2.setAnswerId(363);
			  answer2.setAnswer("java has different type of framework.");
			  answer2.setQuestion(q1);
			  
			  
			  List<Answer> list = new ArrayList<Answer>();
			 list.add(answer);
		     list.add(answer1);
			 list.add(answer2);
			 q1.setAnswers(list);
			  
			  
			  
			  // session to save
			  Session  s = factory.openSession();
			  Transaction tx = s.beginTransaction();
			  
			  //save
			   s.save(q1);
			   s.save(answer);
			  s.save(answer1);
			   s.save(answer2);
			 
			   
			  tx.commit();
			  
			  //fetching
			 Question newQ=(Question)s.get(Question.class,123);
			  System.out.println(newQ.getQuestion());
			  for(Answer a : q1.getAnswers()) {
				  System.out.println(a.getAnswer());
			  }
			 
			  s.close();
			  
			  factory.close();
		}

	}


