package com.telusko.DemoApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApp1Application {

	public static void main(String[] args) {
		System.out.println("Before Run....");
		SpringApplication.run(DemoApp1Application.class, args);
	}

}
