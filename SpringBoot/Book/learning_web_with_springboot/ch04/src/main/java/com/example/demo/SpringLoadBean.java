package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLoadBean {

	public static void main(String ar[]) {
		ApplicationContext ctx = SpringApplication.run(SpringLoadBean.class, ar);
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String beanName : beanNames) {
			System.out.println(beanName);
		}
	}
}
