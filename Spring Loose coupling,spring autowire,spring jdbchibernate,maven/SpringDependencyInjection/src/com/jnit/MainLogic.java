package com.jnit;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("spring.xml");
		BeanFactory f = new XmlBeanFactory(res);

		Resource res1=new ClassPathResource("spring2.xml");
		BeanFactory f1 = new XmlBeanFactory(res1,f);
		
		
		Journey jr=(Journey)f.getBean("travelob");
		jr.startJourney();
		

	}

}
