package cn.com.leadfar.spring;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public void save(String username){
		System.out.println("��["+username+"]���浽���ݿ�");
	}
}
