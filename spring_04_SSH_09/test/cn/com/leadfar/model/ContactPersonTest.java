package cn.com.leadfar.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.leadfar.dao.ContactPersonDao;

import junit.framework.TestCase;

public class ContactPersonTest extends TestCase {
	public void testAddPerson(){
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		ContactPersonDao personDao = (ContactPersonDao)factory.getBean("personDao");
		
		ContactPerson cp = new ContactPerson();
		cp.setName("xxxxx");
		cp.setAddress("beijing");
		
		Group g = new Group("iiiii");
		g.setId(20);
		cp.setGroup(g);
		
		personDao.save(cp);
	}
}
