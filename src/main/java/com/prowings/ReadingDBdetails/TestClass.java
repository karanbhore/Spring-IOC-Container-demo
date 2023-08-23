package com.prowings.ReadingDBdetails;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeansForDbDetailsRead.xml");


		MyDatabaseDetails dbdetails = context.getBean("dbProps", MyDatabaseDetails.class);
		System.out.println(dbdetails);
	}

}