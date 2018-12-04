package com.uae;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.uae.controller.RibbonConfiguration;

@RibbonClient(name = "ping-a-server", configuration = RibbonConfiguration.class)
@SpringBootApplication
@EnableEurekaClient
public class BankApplication extends SpringBootServletInitializer {

	 public static void main(String[] args) throws Exception{
         SpringApplication.run(BankApplication.class, args);
     }
	 
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BankApplication.class);
	}
}
