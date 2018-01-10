package com.yaofeng.maven.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.yaofeng.maven.dao.IAccountDao;

public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

	@Override
	public void addMoney(Integer id, Double money) {
		// TODO Auto-generated method stub
		getJdbcTemplate().update("update sys_account set money=money+? where id = ?",money,id);
	}

	@Override
	public void descMoeny(Integer id, Double money) {
		// TODO Auto-generated method stub
		getJdbcTemplate().update("update sys_account set money=money-? where id = ?",money,id);
	}

}
