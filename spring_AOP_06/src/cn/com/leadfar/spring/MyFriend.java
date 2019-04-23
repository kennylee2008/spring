package cn.com.leadfar.spring;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFriend extends TestCase{
	public void testPlay(){
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		MeInterface me = (MeInterface)factory.getBean("me");
		me.play();
	}
}
