package cn.com.leadfar.spring;

import javax.annotation.Resource;


public class UserAction {
	
	@Resource
	private UserService userService;
	
	public UserAction(){
	}
	
	public String add(){
		System.out.println("add method");
		
		userService.addUser();
		
		return "success";
	}
}
