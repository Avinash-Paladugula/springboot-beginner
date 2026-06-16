package com.being_infinity.Springboot_beginner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBeginnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBeginnerApplication.class, args);
	}

}
// mvn spring-boot:run      --------> to run the application
// http://localhost:8080/hello  --------> to access the endpoint