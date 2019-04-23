package cn.com.leadfar.spring;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserActionTest extends TestCase {

	public void testAdd() {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		UserAction userAction01 = (UserAction)factory.getBean("userAction");
		UserAction userAction02 = (UserAction)factory.getBean("userAction");
		
		//false
		System.out.println(userAction01 == userAction02);
		
		UserService userService01 = (UserService)factory.getBean("userService");
		UserService userService02 = (UserService)factory.getBean("userService");
		
		//true
		System.out.println(userService01 == userService02);
	}
}
