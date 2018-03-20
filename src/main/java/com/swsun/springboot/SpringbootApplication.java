package com.swsun.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.context.WebApplicationContext;

//@SpringBootApplication
//@ServletComponentScan
//public class SpringbootApplication extends SpringBootServletInitializer {
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringbootApplication.class, args);
//	}
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(SpringbootApplication.class);
//	}
//}

@SpringBootApplication
public class SpringbootApplication{
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}