package com.groupthree.ScreenSpot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"controller","service","model", "repository"})
public class ScreenSpotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScreenSpotApplication.class, args);
	}

}
