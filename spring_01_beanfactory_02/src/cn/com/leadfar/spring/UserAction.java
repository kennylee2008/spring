package cn.com.leadfar.spring;

public class UserAction {
	public UserAction() {
		super();
		System.out.println(this+",init");
	}

	public String add(){
		System.out.println("add method");
		return "success";
	}
}
