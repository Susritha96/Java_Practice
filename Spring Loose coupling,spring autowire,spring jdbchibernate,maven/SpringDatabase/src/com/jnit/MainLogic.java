package com.jnit;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("spring.xml");
		BeanFactory f = new XmlBeanFactory(res);
		SpringJdbcSelect o =(SpringJdbcSelect)f.getBean("hto");
	
		
	Student s= new Student();
	s.setSid(108);
	s.setSname("mahesh");
	s.setMarks(500);
		
		

	}

}
