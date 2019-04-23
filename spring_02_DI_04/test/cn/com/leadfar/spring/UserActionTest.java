package cn.com.leadfar.spring;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserActionTest extends TestCase {

	public void testAdd01() {
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		
		//第一个请求，请求上传一个Excel文件
		UserAction userAction01 = (UserAction)factory.getBean("userAction");
		userAction01.upload();
		
//		//第二个请求，请求上传一个Excel文件
//		UserAction userAction02 = (UserAction)factory.getBean("userAction");
//		userAction02.upload();
//		
//		//第三个请求，请求上传一个Excel文件
//		UserAction userAction03 = (UserAction)factory.getBean("userAction");
//		userAction03.upload();
	}
	
}
