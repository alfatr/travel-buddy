package com.travelbuddy.pathfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TravelBuddyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelBuddyApplication.class, args);
	}

}
