package cn.com.leadfar.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class SomeClassClient extends TestCase {
	public void testPlay(){
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		SomeClassElse sc = (SomeClassElse)factory.getBean("someClass");
		sc.play();
	}
}
