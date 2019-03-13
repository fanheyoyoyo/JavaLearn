package com.fanlf.spring.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.fanlf.spring.beans.annotation.Service.UserService;
import com.fanlf.spring.beans.annotation.controller.UserController;
import com.fanlf.spring.beans.annotation.repository.UserRepositoryImpl;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");

		TestObject to = (TestObject) ctx.getBean("testObject");

		System.out.println(to);

		UserController userController = (UserController) ctx.getBean("userController");

		System.out.println(userController);

		UserService userService = (UserService) ctx.getBean("userService");

		System.out.println(userService);

		UserRepositoryImpl userRepository = (UserRepositoryImpl) ctx.getBean("userRepository");

		System.out.println(userRepository);

	}

}
