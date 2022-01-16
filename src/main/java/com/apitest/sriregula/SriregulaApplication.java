package com.apitest.sriregula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.apitest.sriregula"})
public class SriregulaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SriregulaApplication.class, args);
	}

}
