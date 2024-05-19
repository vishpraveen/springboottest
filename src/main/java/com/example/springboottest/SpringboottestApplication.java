package com.example.springboottest;

import com.example.springboottest.di.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringboottestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringboottestApplication.class, args);
		Customer customer = context.getBean(Customer.class);
		customer.display();
	}

}
