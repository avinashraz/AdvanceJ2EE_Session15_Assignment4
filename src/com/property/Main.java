package com.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.property.classes.Person;
import com.property.classes.PersonType;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Person person = (Person)context.getBean("person");
		PersonType ptype = person.getType();
		System.out.println(ptype.getTypeName());

	}

}
