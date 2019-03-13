package com.fanlf.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {
	/*
	 * ��̬���������� ֱ�ӵ���ĳһ����ľ�̬�����Ϳ��Է��� Bean ��ʵ��
	 */
	public static Map<String, Car> cars = new HashMap<String, Car>();

	static {
		cars.put("Audi", new Car("Audi", 300000, 80));
		cars.put("Ford", new Car("Ford", 400000, 90));
	}

	//��̬��������
	public static Car getCar(String name){
		return cars.get(name);
	}
	
}
