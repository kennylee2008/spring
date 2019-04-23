package cn.com.leadfar.spring;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserActionTest extends TestCase {

	public void testAdd01() {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		
		UserAction userAction = (UserAction)factory.getBean(UserAction.class);
		userAction.add();
		
	}
	
	public void testAdd02() {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		
		UserAction userAction = (UserAction)factory.getBean("userAction");
		userAction.add();
		
	}
	
}
