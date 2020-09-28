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
		s.setSid(102);
		s.setSname("xyz");
		s.setMarks(400);
		
		Address a = new Address();
		a.setAid(202);
		a.setCity("Secunderabad");
		a.setState("telangana");
		a.setS_obj(s);
		
		
		
		se.save(a);
		
		
		tx.commit();
		
		se.close();
		sf.close();
		
	}

}