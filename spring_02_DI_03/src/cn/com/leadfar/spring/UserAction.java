package cn.com.leadfar.spring;

public class UserAction {
	
	private UserService userService;
	
	public String add(){
		System.out.println("add method");
		
		userService.addUser();
		
		return "success";
	}
	
	public void upload(){
		userService.uploadExcel(null);
	}
	
	public void setMyUserService(UserService us){
		this.userService = us;
	}
}
