package cn.com.leadfar.spring;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserActionTest extends TestCase {

	public void testAdd01() {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		
		//��һ�����������ϴ�һ��Excel�ļ�
		UserAction userAction01 = (UserAction)factory.getBean("userAction");
		userAction01.upload();
		
//		//�ڶ������������ϴ�һ��Excel�ļ�
//		UserAction userAction02 = (UserAction)factory.getBean("userAction");
//		userAction02.upload();
//		
//		//���������������ϴ�һ��Excel�ļ�
//		UserAction userAction03 = (UserAction)factory.getBean("userAction");
//		userAction03.upload();
	}
	
}
