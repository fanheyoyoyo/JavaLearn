package com.fanlf.spring.autowire;

public class Person {

	private String name;
	private Address address;
	private Car car;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress1(Address address) {
		this.address = address;
	}
	public Car getCar() {
		return car;
	}
	public void setCar1(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", car=" + car + "]";
	}

}
