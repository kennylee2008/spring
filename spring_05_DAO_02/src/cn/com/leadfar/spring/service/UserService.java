package cn.com.leadfar.spring.service;

import cn.com.leadfar.spring.model.User;

public interface UserService {
	public void addUser(User user);
	public void delUser(int userId);
	public void updateUser(User user);
}
