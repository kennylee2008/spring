package cn.com.leadfar.spring;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserActionTest extends TestCase {

	public void testAdd() {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		UserAction userAction = (UserAction)factory.getBean("userAction1");
		//UserAction userAction = factory.getBean(UserAction.class);
		userAction.add();
	}
	
//	public void testAdd02() {
//		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
//		//UserAction userAction = (UserAction)factory.getBean("userAction");
//		UserAction userAction = factory.getBean(MyUserAction.class);
//		userAction.add();
//	}
	
	public void testAdd03() {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		MyUserAction userAction = (MyUserAction)factory.getBean("/myUserAction");
		userAction.add();
	}
	
	public void testAdd04() {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		MyUserAction userAction = factory.getBean(MyUserAction.class);
		userAction.add();
	}
	
	public void testAdd05() {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		
		//没有声明ID或name,不能通过id或name来访问
		MyUserAction userAction = (MyUserAction)factory.getBean("myUserAction");
		userAction.add();
	}
}
