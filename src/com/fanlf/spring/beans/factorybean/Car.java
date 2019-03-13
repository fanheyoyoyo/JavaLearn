package com.fanlf.spring.beans.factorybean;

public class Car {
	private String brand;
	private double price;
	private double tyrePerimeter;

	public double getTyrePerimeter() {
		return tyrePerimeter;
	}

	public void setTyrePerimeter(double tyrePerimeter) {
		this.tyrePerimeter = tyrePerimeter;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tyrePerimeter=" + tyrePerimeter + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, double price, double tyrePerimeter) {
		super();
		this.brand = brand;
		this.price = price;
		this.tyrePerimeter = tyrePerimeter;
	}
	
	
}
