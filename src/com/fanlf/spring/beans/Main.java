package com.fanlf.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fanlf.spring.beans.Person;

public class Main {
	public static void main(String[] args) {

		/*
		 * //创建 HelloWorld对象 HelloWorld helloWorld = new HelloWorld();
		 * //给name属性赋值 helloWorld.setName("Spring");
		 */

		// 1. 创建Spring的IOC容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2. 从IOC容器中获取bean实例
		// HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");

		// System.out.println(helloWorld);
		// 3. 调用hello方法
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
