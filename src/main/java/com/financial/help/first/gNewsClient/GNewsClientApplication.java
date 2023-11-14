package com.financial.help.first.gNewsClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class GNewsClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GNewsClientApplication.class, args);
	}

}
