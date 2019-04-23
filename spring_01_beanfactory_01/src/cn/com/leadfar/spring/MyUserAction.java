package cn.com.leadfar.spring;

public class MyUserAction {
	public MyUserAction() {
		super();
		System.out.println(this);
	}

	public String add(){
		System.out.println("add method");
		return "success";
	}
}
