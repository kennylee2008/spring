package cn.com.leadfar.spring;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Friend extends TestCase{
	public void testPlay(){
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		Me me = (Me)factory.getBean("me");
		me.play();
	}
}
