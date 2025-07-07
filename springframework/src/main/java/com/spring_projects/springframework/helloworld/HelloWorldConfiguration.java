package com.spring_projects.springframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//record Person (String name, int age) {};
record Person (String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Spring";
	}
	
	@Bean
	public int age() {
		return 20;
	}
	
	@Bean
	public Person testperson() {
		var person = new Person("KD",22,new Address("Baker Street","London"));
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		var person = new Person(name(),age(),testAddress());
		return person;
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address2) {
		var person = new Person(name, age, address2);
		return person;
	}
	
	@Bean(name = "customAddress")
	public Address testAddress() {
		var address = new Address("102 Dundas","Wozan");
		return address;
	}
	
	@Bean
	public Address address2() {
		var address = new Address("New Road North","Toronto");
		return address;
	}

}
