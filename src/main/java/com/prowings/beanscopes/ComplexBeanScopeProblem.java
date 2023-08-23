package com.prowings.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexBeanScopeProblem {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ComplexBeanScopProblemSpringBeans.xml");

		FourWheeler car1= context.getBean("fourWheeler1", FourWheeler.class);

		System.out.println("car1: " + car1);

		FourWheeler car2= context.getBean("fourWheeler1", FourWheeler.class);
		System.out.println("car2: " + car2);

		System.out.println(car1== car2);

		System.out.println(car1.getEngine() == car2.getEngine());

	}

}