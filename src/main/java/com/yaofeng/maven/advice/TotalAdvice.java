package com.yaofeng.maven.advice;

public class TotalAdvice {

	public void before() {
		System.out.println("ǰ��֪ͨ");
	}
	
	public void afterReturning() {
		System.out.println("����֪ͨ");
	}
	public void afterException() {
		System.out.println("�쳣֪ͨ");
	}
	public void after() {
		System.out.println("finally֪ͨ");
	}
}
