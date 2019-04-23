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
		user.setUsername("����");
		
		userAction.setUser(user);
		
		//ģ��ͻ��˵���add()����
		userAction.add();
	}
	
	public void testAdd02() {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		UserAction userAction = (UserAction)factory.getBean("userAction");
		
		User user = new User();
		user.setUsername("����");
		
		Group g = new Group();
		g.setName("������");
		user.setGroup(g);
		
		userAction.setUser(user);
		
		//ģ��ͻ��˵���add()����
		userAction.add();
	}

}
