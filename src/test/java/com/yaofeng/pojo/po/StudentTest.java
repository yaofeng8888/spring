package com.yaofeng.pojo.po;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

	@SuppressWarnings("resource")
	@Test
	public void test1() {
		//³õÊ¼»¯IoCÈÝÆ÷
			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//			Student bean = (Student) context.getBean("student");
//			System.out.println(bean);
			/*	Student bean2 = context.getBean("studentname", Student.class);
			System.out.println(bean);
			System.out.println(bean2);*/
			
			/*Student factory = (Student) context.getBean("studentfactory");
			System.out.println(factory);*/
			Phone bean2 = (Phone) context.getBean("phone");
			System.out.println(bean2);

	}
}
