package cn.com.leadfar.services.impl;

import cn.com.leadfar.services.RoleService;
import cn.com.leadfar.services.UserService;

public class RoleServiceImpl implements RoleService {

	private UserService userService;
	
	@Override
	public void someBusinessMethod1() {
		System.out.println(this+",someBusinessMethod1");
	}

	@Override
	public void someBusinessMethod2() {
		// TODO Auto-generated method stub

	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
