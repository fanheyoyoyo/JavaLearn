package com.fanlf.spring.beans.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fanlf.spring.beans.annotation.Service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	
	public void excute(){
		System.out.println("UserController excute...");
		userService.add();
	}
}
