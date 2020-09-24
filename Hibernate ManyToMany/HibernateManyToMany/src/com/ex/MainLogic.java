package com.ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class MainLogic {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure("config.xml");
		
		SessionFactory sf=cf.buildSessionFactory();
       
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		
		Student s=new Student();
		s.setSid(101);
		s.setSname("shiva");
		s.setMarks(400);
		
		Student s1=new Student();
		s1.setSid(102);
		s1.setSname("ravi");
		s1.setMarks(700);
		
		Course c=new Course();
		c.setCid(201);
		c.setCname("JAVA");
		c.setPrice(600);
		
		Set ss=new HashSet();
		ss.add(c);
		s.setC_obj(ss);
		s1.setC_obj(ss);
		se.save(s);
		se.save(s1);
		
		
		
		
		
		
		tx.commit();
		
		se.close();
		sf.close();
		
	}

}