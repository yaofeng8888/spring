package com.yaofeng.maven.impl;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.yaofeng.maven.dao.IAccountDao;
import com.yaofeng.maven.service.IAccountService;

public class AccountServiceImpl implements IAccountService {

	
	private IAccountDao dao;
	private TransactionTemplate tt;
	@Override
	public void transfer(Integer from, Integer to, Double money) {

		tt.execute(new TransactionCallbackWithoutResult() {
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				//ºı«Æ
				dao.descMoeny(from, money);
//				int a = 10/0;
				//º”«Æ
				dao.addMoney(to, money);
			}
		});
		
		
	}
	public IAccountDao getDao() {
		return dao;
	}
	public void setDao(IAccountDao dao) {
		this.dao = dao;
	}
	public TransactionTemplate getTt() {
		return tt;
	}
	public void setTt(TransactionTemplate tt) {
		this.tt = tt;
	}
	

}
