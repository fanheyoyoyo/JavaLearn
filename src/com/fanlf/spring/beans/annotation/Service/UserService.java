package com.fanlf.spring.beans.annotation.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.fanlf.spring.beans.annotation.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	@Qualifier("userRepositoryImpl")
	private UserRepository userRepository;

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void add() {
		System.out.println("UserService add...");
		userRepository.save();
	}

}
