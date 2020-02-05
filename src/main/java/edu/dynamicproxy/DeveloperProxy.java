package edu.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DeveloperProxy implements InvocationHandler {

	public Object object;
	public Object[] params;

	public DeveloperProxy(Object object, Object[] params) {
		super();
		this.object = object;
		this.params = params;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		return method.invoke(object, params);
	}

}
