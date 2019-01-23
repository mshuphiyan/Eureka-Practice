package com.service.feignclient.client;

//@FeignClient(name = "rest-producer", url = "http://localhost:9093", fallback = GreetingClient.GreetingClientFallback.class)
public interface GreetingClient extends FeignMessage {
	
	public static class GreetingClientFallback implements FeignMessage {

		@Override
		public String message() {
			return "Message from hysterix";
		}

	}
}
