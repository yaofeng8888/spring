package com.yaofeng.pojo.po;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yaofeng.maven.service.IAccountService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class AccountTest {

	@Resource(name="accountServiceImpl")
	private IAccountService as;
	@Test
	public void test() {
		as.transfer(1, 2, 100d);
	
	}
	
}
