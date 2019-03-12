package com.fanlf.spring.beans.cycle;
/***
 * 
 * @author fanlf
 *
 */

public class Car {

	private String brand;

	public Car() {
		System.out.println("Car's Constrcutor..");
	}

	public void setBrand(String brand) {
		System.out.println("setBrand..");
		this.brand = brand;
	}

	public void init() {
		System.out.println("init..");
	}

	public void destroy() {
		System.out.println("destroy");
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}
}
