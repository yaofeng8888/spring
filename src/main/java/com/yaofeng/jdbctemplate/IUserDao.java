package com.yaofeng.jdbctemplate;

import java.util.List;

import com.yaofeng.pojo.po.User;

public interface IUserDao {

	//增加
	void save(User u);
	//删除
	void delete(Integer id);
	//修改
	void update(User u);
	//查询
	User select(Integer id);
	//分页查询
	int selectTotalCount();
	//查询所有
	List<User> getAll();
	
}
