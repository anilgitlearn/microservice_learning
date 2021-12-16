package com.javatechie.os.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
// added comment
@SpringBootApplication
@EnableEurekaClient
public class OrderserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderserviceApplication.class, args);
	}
 //test github from eclipse
	@Bean
	@LoadBalanced
	
	 public RestTemplate getRest(){
		 return new RestTemplate();
	 }
	
	//for abc
	//again
}
