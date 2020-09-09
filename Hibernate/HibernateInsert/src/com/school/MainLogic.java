package com.school;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainLogic {

	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure("configuration.xml");
		
		SessionFactory sf=cf.buildSessionFactory();
		
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		
		Student susritha = new Student();
		susritha.setId(123);
		susritha.setName("susritha");
		susritha.setMarks(600);
		
		se.save(susritha);
		
		tx.commit();
		se.close();
		sf.close();
		

	}

}
