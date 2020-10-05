package com.jnit;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class SpringJdbcSelect {
	HibernateTemplate ht;

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	public void insert(Student s) {
		ht.save(s);
	}
	
}
