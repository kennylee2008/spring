package cn.com.leadfar.spring;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public void addUser(User user) {
		System.out.println(this+":addUser");
	}

	@Override
	public void delUser(int userId) {
		System.out.println(this+":delUser");
	}

	@Override
	public void updateUser(User user) {
		System.out.println(this+":updateUser");
	}

}
