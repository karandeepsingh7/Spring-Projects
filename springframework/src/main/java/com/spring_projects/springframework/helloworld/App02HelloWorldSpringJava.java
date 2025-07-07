package com.spring_projects.springframework.helloworld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpringJava {

	public static void main(String[] args) {
		try (//Launch a Spring Context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			//Configure the things that we want Spring to manage - @Configuration
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("testperson"));
			
			System.out.println(context.getBean("person2MethodCall"));
			
			System.out.println(context.getBean("person3Parameters"));
			
			System.out.println(context.getBean("customAddress"));
			
			//List all Beans Managed by Spring Framework
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
