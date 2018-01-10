package com.yaofeng.pojo.po;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yaofeng.jdbctemplate.IUserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserDaoTest {
	@Resource(name="userDaoImpl")
	private IUserDao ud;
	
	@Test
	public void test() {
		User u = new User();
		u.setName("tom");
		ud.save(u);
	}
}
