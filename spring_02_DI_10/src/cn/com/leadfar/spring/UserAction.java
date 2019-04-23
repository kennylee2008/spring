package cn.com.leadfar.spring;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;


public class UserAction {
	
	private UserService userService;
	
	public UserAction(){
	}
	
	public String add(){
		System.out.println("add method");
		
		userService.addUser();
		
		return "success";
	}
	
	@Resource(name="userService")
	//@Autowired
	public void setUserService001(UserService userService) {
		this.userService = userService;
	}
}
