package com.EX;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainLogic {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("spring.xml");
		BeanFactory f = new XmlBeanFactory(res);
		Category o=(Category)f.getBean("cc");
		
		Book k =o.getBk();
		System.out.println(k.getBname()+" "+k.getBprice()+" "+k.getBauthor()+" "+o.getCname());

	}

}
