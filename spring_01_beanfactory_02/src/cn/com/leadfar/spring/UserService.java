package cn.com.leadfar.spring;

public class UserService {
	
	public UserService() {
		super();
		System.out.println(this+",init");
	}

	public void addUser(){
		System.out.println("UserService.addUser()");
	}
}
