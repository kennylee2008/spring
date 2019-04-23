package cn.com.leadfar.spring;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("userAction")
@Scope("prototype")
public class UserAction {
	
	@Resource(name="")
	private UserService userService;
	
	public UserAction(){
	}
	
	public String add(){
		System.out.println("add method");
		
		userService.addUser();
		
		return "success";
	}
}
