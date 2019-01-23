package com.service.eureka.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
	@RequestMapping("/greeting")
	public String getMessage(){
		return "Hello from client service";
	}
}
