package com.hysterix.example.hesterixdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hysterix.example.hesterixdemo.service.HysterixService;

@EnableCircuitBreaker
@SpringBootApplication
@RestController
public class HesterixdemoApplication {
	@Autowired
	private HysterixService hysterixService;
	
	@Bean
	public RestTemplate rest(RestTemplateBuilder builder){
		return builder.build();
	}
	
	@RequestMapping("/toread")
	public String toRead(){
		return hysterixService.readMessage();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HesterixdemoApplication.class, args);
	}

}

