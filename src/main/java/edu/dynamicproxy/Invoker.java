package edu.dynamicproxy;

import java.lang.reflect.Proxy;

public class Invoker {

	public static void main(String[] args) {
		JavaDeveloper developer = new JavaDeveloper();
		Developer proxy = (Developer) Proxy.newProxyInstance(Developer.class.getClassLoader(), new Class[] { Developer.class},
				new DeveloperProxy(developer, new Object[] {"Pradeep Kumar"}));
		
		System.out.println(developer.getName("Siddharth"));
		System.out.println(proxy.getName("Siddharth"));

	}

}
