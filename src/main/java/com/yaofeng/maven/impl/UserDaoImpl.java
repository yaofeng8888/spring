package com.yaofeng.maven.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.yaofeng.jdbctemplate.IUserDao;
import com.yaofeng.pojo.po.User;

public class UserDaoImpl implements IUserDao {
		//使用jdbc模板实现增删改查
	
		private JdbcTemplate jt;
	@Override
	public void save(User u) {
		// TODO Auto-generated method stub
		String sql="INSERT INTO sys_user VALUES(11,'sss',?,'121','nan')";
		jt.update(sql,u.getName());
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		String sql="delete * from sys_user where id=?";
		jt.update(sql,id);
	}

	@Override
	public void update(User u) {
		// TODO Auto-generated method stub
		String sql="update sys_user set name=? and id=?";
		jt.update(sql,u.getId(),u.getName());
	}

	@Override
	public User select(Integer id) {
		// TODO Auto-generated method stub
		String sql="select * from sys_user where id=?";
		return  jt.queryForObject(sql, new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				return u;
			}}, id);
		
	}

	@Override
	public int selectTotalCount() {
		// TODO Auto-generated method stub
		String sql="select count(*) from sys_user";
		Integer count = jt.queryForObject(sql, Integer.class);
		return count;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		String sql="select * from sys_user";
		List<User> list = jt.query(sql, new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				return u;
			}});
		
		return list;
	}

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	
	
	

}
