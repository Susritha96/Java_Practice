package com.example;

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
		Configuration cf = new Configuration();
		cf.configure("configuration.xml");
		
		SessionFactory sf=cf.buildSessionFactory();
		
		Session se=sf.openSession();
		Transaction tx=se.beginTransaction();
		
		
		Customer rahul=new Customer();
		rahul.setCid(1023);
		rahul.setCname("rahul");
		
		Customer shiva=new Customer();
		shiva.setCid(1025);
		shiva.setCname("shiva ");
		
		Set hs=new HashSet();
		hs.add(rahul);
		hs.add(shiva);
		
		
		Vendor v=new Vendor();
		v.setVid(101);
		v.setVname("amazon");
		v.setC_obj(hs);
		
		se.save(v);
		tx.commit();
		se.close();
		sf.close();
		

	}

}
