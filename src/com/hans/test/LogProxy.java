package com.hans.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogProxy implements InvocationHandler {
	private Object object;

	public LogProxy(Object object) {
		this.object = object;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		before();
		Object o = arg1.invoke(object, arg2);
		after();
		return o;
	}

	public void before() {
		System.out.println("before run ....");
	}

	public void after() {
		System.out.println("after run ....");
	}
}
