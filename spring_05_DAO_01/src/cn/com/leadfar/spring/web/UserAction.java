package cn.com.leadfar.spring.web;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import cn.com.leadfar.spring.model.User;
import cn.com.leadfar.spring.service.UserService;

@Controller
@Scope("prototype")
public class UserAction {
	
	private User user;
	
	@Resource
	private UserService userService;
	
	public String add(){
		userService.addUser(user);
		return "success";
	}
	
	public String del(){
		userService.delUser(user.getId());
		return "success";
	}
	
	//.....

	public void setUser(User user) {
		this.user = user;
	}
}
