package com.yaofeng.maven.advice;

public class TotalAdvice {

	public void before() {
		System.out.println("前置通知");
	}
	
	public void afterReturning() {
		System.out.println("后置通知");
	}
	public void afterException() {
		System.out.println("异常通知");
	}
	public void after() {
		System.out.println("finally通知");
	}
}
