package com.au.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.au.aop.service.ShapeService;

public class AopMain {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new FileSystemXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeservice", ShapeService.class);
		System.out.println("-----------");
		shapeService.getCircle().setName("Hello I am a Circle");
		System.out.println("------------");
		System.out.println(shapeService.getCircle().getName());
		System.out.println("------------");
		System.out.println(shapeService.getTriangle().getName());
		System.out.println("------------");
		shapeService.getTriangle().throwExceptionDemo();
		
	}

}
