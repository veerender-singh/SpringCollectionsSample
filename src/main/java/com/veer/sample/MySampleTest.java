package com.veer.sample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.veer.sample.beans.CustomerService;

public class MySampleTest {

	public static void main(String[] args) {
		 Resource r=new ClassPathResource("com/veer/sample/cfg/applicationContext.xml");  
	     BeanFactory factory=new XmlBeanFactory(r);  
         CustomerService cs= factory.getBean("customerService",CustomerService.class);  
         System.out.println(cs);
	}

}
