package com.prowings.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.models.Car;
import com.prowings.models.Employee;
import com.prowings.models.Student;

public class TestIocContainer3 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springBeans2.xml");

		Car c1 = context.getBean("car1", Car.class);

		System.out.println(c1);

	}

}