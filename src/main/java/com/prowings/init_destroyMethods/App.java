package com.prowings.init_destroyMethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.init_destroyMethods.CustomerService;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("init_destroy()Bean.xml");

		CustomerService cust = (CustomerService) context.getBean("customerService");

		System.out.println(cust);

		((ConfigurableApplicationContext) context).close();
	}
}