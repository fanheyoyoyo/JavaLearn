package com.fanlf.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fanlf.spring.collections.Person;

public class Main {
	public static void main(String[] args) {

		/*
		 * //���� HelloWorld���� HelloWorld helloWorld = new HelloWorld();
		 * //��name���Ը�ֵ helloWorld.setName("Spring");
		 */

		// 1. ����Spring��IOC��������
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2. ��IOC�����л�ȡbeanʵ��
		// HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");

		// System.out.println(helloWorld);
		// 3. ����hello����
		// helloWorld.hello();

		Car car = (Car) ctx.getBean("car");
		System.out.println(car);

		car = (Car) ctx.getBean("car2");
		System.out.println(car);
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		
		person = (Person) ctx.getBean("person2");
		System.out.println(person);
				
	}
}
