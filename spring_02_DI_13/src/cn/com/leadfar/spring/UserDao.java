package cn.com.leadfar.spring;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public void save(String username){
		System.out.println("将["+username+"]保存到数据库");
	}
}
