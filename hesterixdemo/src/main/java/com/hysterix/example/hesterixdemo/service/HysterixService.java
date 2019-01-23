package com.hysterix.example.hesterixdemo.service;

import java.net.URI;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HysterixService {
	private final RestTemplate restTemplate;
	
	public HysterixService(RestTemplate restTemplate){
		this.restTemplate=restTemplate;
	}
	
	@HystrixCommand(fallbackMethod="reliable")
	public String readMessage(){
		URI uri=URI.create("http://192.168.1.4:9093/getmessage");
		return this.restTemplate.getForObject(uri, String.class);
	}
	
	public String reliable(){
		return "Message from Hysterix service.";
	}
}
