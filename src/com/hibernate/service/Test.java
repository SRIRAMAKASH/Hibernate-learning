package com.hibernate.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class Test {

	public static void main(String[] args) 
	{
		System.out.println("Connection to database");
		SessionFactory factory =new Configuration()
								.configure("hibernate.cfg.xml")
								.buildSessionFactory();
		Session session=null;
		Transaction tx=null;
		
		Student st1=new Student("akash","cse",4);
		Student st2=new Student("Sri","mech",2);
		Student st3=new Student("Ram","eee",1);
		Student st4=new Student("Sriramakash","cse",3);
		
		try
		{
			session=factory.getCurrentSession();
			tx=session.beginTransaction();
			//createdTable(session, st1, st2, st3, st4);
			//selectData(session);
			//selectMultipleQuery(session, tx);
			tx.commit();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		finally
		{
			session.close();
		}
		
	}

	private static void selectMultipleQuery(Session session) {
		List<Student> student=session.createQuery("from Student").list();
		for(Student st:student)
			System.out.println(st);
		
	}

	private static void selectData(Session session) {
		Student student=session.get(Student.class, 2);
		System.out.println("Student :"+student);
	}

	private static void createdTable(Session session, Student st1, Student st2, Student st3, Student st4) {
		session.save(st1);
		session.save(st2);
		session.save(st3);
		session.save(st4);
	}

}
