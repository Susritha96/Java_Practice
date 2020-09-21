package com.school;

import java.util.Iterator;
import java.util.List;

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
		
		
		Query qr=se.getNamedQuery("dell");
		List l = qr.list();
		Iterator li = l.iterator();
		while(li.hasNext()) {
			Object []a =(Object[])li.next();
			System.out.println(a[0]+" "+a[1]+" "+a[2]);
		}
		
		
		tx.commit();
		se.close();
		sf.close();
		

	}

}
