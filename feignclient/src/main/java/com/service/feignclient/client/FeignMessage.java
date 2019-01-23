package com.service.feignclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("client-service")
public interface FeignMessage {
	@RequestMapping("/greeting")
	public String message();
}
