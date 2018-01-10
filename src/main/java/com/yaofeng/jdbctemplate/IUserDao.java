package com.yaofeng.jdbctemplate;

import java.util.List;

import com.yaofeng.pojo.po.User;

public interface IUserDao {

	//����
	void save(User u);
	//ɾ��
	void delete(Integer id);
	//�޸�
	void update(User u);
	//��ѯ
	User select(Integer id);
	//��ҳ��ѯ
	int selectTotalCount();
	//��ѯ����
	List<User> getAll();
	
}
