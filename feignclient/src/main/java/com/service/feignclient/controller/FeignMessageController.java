package com.service.feignclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.feignclient.client.FeignMessage;

@RestController
public class FeignMessageController {
	@Autowired
	FeignMessage feignMessage;
	
	@RequestMapping("/getmessage")
	public String getMessage(){
		return feignMessage.message();
	}

}
