package com.fanlf.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;
//�Զ����FactoryBean��Ҫʵ��FactoryBean���ṩ�Ľӿ�
public class CarFactoryBean implements FactoryBean<Car>{

	//����Bean�Ķ���
	@Override
	public Car getObject() throws Exception {
		return new Car("BMW", 500000, 75);
	}

	//����Bean������
	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	//����Bean�Ƿ�Ϊ����
	@Override
	public boolean isSingleton() {
		return true;
	}
	

}
