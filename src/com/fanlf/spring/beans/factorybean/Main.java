package com.fanlf.spring.beans.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-factoryBean.xml");
		
		Car car = (Car) ctx.getBean("car");
		
		System.out.println(car);
		
	}
	
}