package cn.com.leadfar.spring;

import org.springframework.stereotype.Component;

@Component
public class UserService{
	
	public UserService() {
	}

	public void addUser(){
		System.out.println("UserService.addUser()");
	}
}
