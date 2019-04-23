package cn.com.leadfar.spring;

public class UserAction {
	
	private UserService userService;
	
	//通过构造方法来注入依赖
	public UserAction(UserService userService){
		this.userService = userService;
	}
	
	public String add(){
		System.out.println("add method");
		
		userService.addUser();
		
		return "success";
	}
	
	public void upload(){
		userService.uploadExcel(null);
	}
}
