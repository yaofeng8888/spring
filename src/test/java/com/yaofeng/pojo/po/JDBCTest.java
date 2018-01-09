package com.yaofeng.pojo.po;


import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JDBCTest {

	@Test
	public void test() throws Exception {
			ComboPooledDataSource data = new ComboPooledDataSource();
			data.setDriverClass("com.mysql.jdbc.Driver");
	        data.setJdbcUrl("jdbc:mysql://localhost:3306/test1");
	        data.setUser("root");
	        data.setPassword("123");
			
			System.out.println(data);
			
			//创建JDBC的模板
			JdbcTemplate template = new JdbcTemplate(data);
			
			template.update("insert into sys_user values(?,?,?,?,?)",9,"jaj","麻子麻子","232","jakj" );
			
			
			
	}
}
