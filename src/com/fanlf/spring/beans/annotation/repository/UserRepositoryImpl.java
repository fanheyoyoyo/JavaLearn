package com.fanlf.spring.beans.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fanlf.spring.beans.annotation.TestObject;

@Repository
public class UserRepositoryImpl implements UserRepository {
	@Autowired(required=false)
	private TestObject testObject;

	@Override
	public void save() {
		System.out.println("UserRepositoryImpl save...");
		System.out.println(testObject);
	}

}
