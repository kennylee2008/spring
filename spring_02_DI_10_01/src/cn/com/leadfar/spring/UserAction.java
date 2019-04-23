package cn.com.leadfar.spring;

import javax.annotation.Resource;

public class UserAction {
	
	private UserService userService;
	
	public UserAction(){
	}
	
	public String add(){
		System.out.println("add method");
		
		userService.addUser();
		
		return "success";
	}
	
	@Resource
	public void setUserService001(UserService userService) {
		this.userService = userService;
	}
}
