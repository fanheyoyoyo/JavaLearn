package com.fanlf.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {

	private Map<String, Car> cars = null;

	public InstanceCarFactory() {
		cars = new HashMap<String, Car>();
		cars.put("Audi", new Car("Audi", 300000, 80));
		cars.put("Ford", new Car("Ford", 400000, 90));
	}
	
	public Car getCar(String brand){
		return cars.get(brand);
	}
	
}
