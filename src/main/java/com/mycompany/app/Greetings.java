package com.mycompany.app;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Greetings {
	
	@Pointcut("execution(* com.mycompany.app.Performer.perform(..))")
	public void performance(){}
	
	public void greet() {
		System.out.println("Welcome at my concert");
	}
	
	
	@Around("performance()")
	public void makePerformance(ProceedingJoinPoint jointpoint){
		try{
			System.out.println("Well.. I`ll start");
			long start = System.currentTimeMillis();
			
			jointpoint.proceed();
			long end = System.currentTimeMillis();
			System.out.println("Performance took "+ (end - start) + " ms.");
		} catch (Throwable t){
			System.out.println("Sorry");
		}
	}
}
