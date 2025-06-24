package com.spring_projects.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpringJava {

	public static void main(String[] args) {
		//Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		//Configure the things that we want Spring to manage - @Configuration
		System.out.println(context.getBean("name"));
	}

}
