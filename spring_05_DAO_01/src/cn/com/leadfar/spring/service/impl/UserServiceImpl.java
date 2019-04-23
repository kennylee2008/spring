package cn.com.leadfar.spring.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.leadfar.spring.dao.GroupDao;
import cn.com.leadfar.spring.dao.UserDao;
import cn.com.leadfar.spring.model.User;
import cn.com.leadfar.spring.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	
	@Resource
	private GroupDao groupDao;
	
	@Override
	public void addUser(User user) {
		System.out.println(this+":addUser");
		
		if(user.getGroup() != null){
			if(user.getGroup().getId() == 0){ //表示要添加一个组
				int gid = groupDao.add(user.getGroup());
				user.getGroup().setId(gid);
			}else{ //表示要更新用户对应的组
				//TODO ....
			}
		}
		
		userDao.add(user);
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
