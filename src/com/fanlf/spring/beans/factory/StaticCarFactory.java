package com.fanlf.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {
	/*
	 * 静态工厂方法： 直接调用某一个类的静态方法就可以返回 Bean 的实例
	 */
	public static Map<String, Car> cars = new HashMap<String, Car>();

	static {
		cars.put("Audi", new Car("Audi", 300000, 80));
		cars.put("Ford", new Car("Ford", 400000, 90));
	}

	//静态工厂方法
	public static Car getCar(String name){
		return cars.get(name);
	}
	
}
