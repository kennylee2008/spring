package cn.com.leadfar.spring.dao;

import cn.com.leadfar.spring.model.User;

public interface UserDao {
	public void add(User user);
	public void del(User user);
	public void update(User user);
}
