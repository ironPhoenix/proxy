package com.hans.test;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car benz = new Benz();
		LogProxy lp = new LogProxy(benz);
		Car car = (Car) Proxy.newProxyInstance(benz.getClass().getClassLoader(), benz.getClass().getInterfaces(), lp);
		car.run();
	}

}
