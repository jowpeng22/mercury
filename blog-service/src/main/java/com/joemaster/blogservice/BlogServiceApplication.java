package com.joemaster.blogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BlogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogServiceApplication.class, args);
	}

}
