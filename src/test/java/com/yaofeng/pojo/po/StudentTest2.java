package com.yaofeng.pojo.po;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yaofeng.collection.MyCollection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-test.xml"})

public class StudentTest2 {

	@Autowired
	private Phone phone;
	@Test
	public void test1() {
			System.out.println(phone);
	}
}
