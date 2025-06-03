package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("hello");

		int a = 2;
		int b = 4;
		int c = a+b;
		System.out.println("The summation is :"+c);
	}

}
