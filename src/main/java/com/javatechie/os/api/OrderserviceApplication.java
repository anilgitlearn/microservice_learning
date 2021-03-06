package com.javatechie.os.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
// added comment
// from main github to eclipse
@SpringBootApplication
@EnableEurekaClient
public class OrderserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderserviceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	 public RestTemplate getRest(){
		 return new RestTemplate();
	 }
	
	//for abc
	//again
}
