package com.test.fizzbuzz.fizzbuzztest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.test.fizzbuzz")
public class FizzBuzzTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzTestApplication.class, args);
	}
}
