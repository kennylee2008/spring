package cn.com.leadfar.spring;

public class UserAction extends BaseAction{

	public String add(){
		System.out.println("add method");
		
		userService.addUser();
		
		return "success";
	}

}
