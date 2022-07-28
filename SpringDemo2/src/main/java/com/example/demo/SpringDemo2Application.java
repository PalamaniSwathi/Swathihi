package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import comp.MyComponent;

@SpringBootApplication
@ComponentScan(basePackages= {"comp","dao","service"})
public class SpringDemo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringDemo2Application.class, args);
		
		MyComponent myc=ctx.getBean("mycomp",MyComponent.class);
		
		myc.comp();
	}

}
