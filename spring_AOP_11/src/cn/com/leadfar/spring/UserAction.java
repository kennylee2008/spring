package cn.com.leadfar.spring;

public class UserAction {
	
	private User user;
	
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
