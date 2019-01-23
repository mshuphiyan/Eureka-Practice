package com.demo.zoolexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.demo.zoolexample.filters.pre.MessageFilter;

@EnableZuulProxy
@SpringBootApplication
public class ZoolexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoolexampleApplication.class, args);
	}
	
	@Bean
	public MessageFilter messageFilter(){
		return new MessageFilter();
	}

}

