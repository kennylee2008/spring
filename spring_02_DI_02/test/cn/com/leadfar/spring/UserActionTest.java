package cn.com.leadfar.spring;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserActionTest extends TestCase {

	public void testAdd01() {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		UserAction userAction = (UserAction)factory.getBean("userAction");

		//????
		//下面这个方法是否可以正常运行？为什么？
		userAction.add();
	}
}
