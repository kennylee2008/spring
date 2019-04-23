package cn.com.leadfar.spring;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.leadfar.spring.model.Group;
import cn.com.leadfar.spring.model.User;
import cn.com.leadfar.spring.web.UserAction;

public class UserActionTest extends TestCase {

	public void testAdd01() {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		UserAction userAction = (UserAction)factory.getBean("userAction");
		
		User user = new User();
		user.setUsername("张三");
		
		userAction.setUser(user);
		
		//模拟客户端调用add()方法
		userAction.add();
	}
	
	public void testAdd02() {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		UserAction userAction = (UserAction)factory.getBean("userAction");
		
		User user = new User();
		user.setUsername("张三");
		
		Group g = new Group();
		g.setName("测试组");
		user.setGroup(g);
		
		userAction.setUser(user);
		
		//模拟客户端调用add()方法
		userAction.add();
	}

}
