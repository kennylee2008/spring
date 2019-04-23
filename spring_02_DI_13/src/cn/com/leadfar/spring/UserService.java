package cn.com.leadfar.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class UserService{
	
	@Resource
	private UserDao userDao;
	
	public UserService() {
	}

	public void addUser(){
		System.out.println("UserService.addUser()");
		userDao.save("xxxx");
	}
}
