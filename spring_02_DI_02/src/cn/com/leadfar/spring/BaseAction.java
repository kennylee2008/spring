package cn.com.leadfar.spring;

public class BaseAction {
	protected UserService userService;
	
	public void setMyUserService(UserService us){
        this.userService = us;
	}
}
