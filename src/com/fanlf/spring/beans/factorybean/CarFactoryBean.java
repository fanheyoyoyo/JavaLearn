package com.fanlf.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;
//自定义的FactoryBean需要实现FactoryBean给提供的接口
public class CarFactoryBean implements FactoryBean<Car>{

	//返回Bean的对象
	@Override
	public Car getObject() throws Exception {
		return new Car("BMW", 500000, 75);
	}

	//返回Bean的类型
	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	//返回Bean是否为单例
	@Override
	public boolean isSingleton() {
		return true;
	}
	

}
