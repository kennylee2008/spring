package cn.com.leadfar.spring;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class YourFriend extends TestCase{
	public void testPlay(){
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		YouInterface you = (YouInterface)factory.getBean("you");
		you.playInChangCheng();
	}
}
