package com.fanlf.spring.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fanlf.spring.autowire.Address;
import com.fanlf.spring.autowire.Person;

public class Main {
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");

		Address address = (Address) ctx.getBean("address3");

		System.out.println(address);

	    address = (Address) ctx.getBean("address2");

		System.out.println(address);
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}
}