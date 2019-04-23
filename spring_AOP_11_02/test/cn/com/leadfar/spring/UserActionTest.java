package cn.com.leadfar.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class UserActionTest extends TestCase {

	public void testAdd() {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		UserAction userAction = (UserAction)factory.getBean("userAction");
		
		User user = new User();
		user.setUsername("张三");
		
		userAction.setUser(user);
		
		//模拟客户端调用add()方法
		userAction.add();
	}

}
