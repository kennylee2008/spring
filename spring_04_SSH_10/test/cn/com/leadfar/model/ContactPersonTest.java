package cn.com.leadfar.model;

import java.util.Random;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import cn.com.leadfar.dao.ContactPersonDao;
import cn.com.leadfar.service.ContactPersonService;

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
	
	public void testAddPersons(){
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		ContactPersonService ps = (ContactPersonService)factory.getBean("personService");
		for(int i=0; i < 10000; i++){
			ContactPerson cp = new ContactPerson();
			cp.setName("随便一个名称"+(1000000+i));
			cp.setAddress("北京"+new Random().nextInt(99999));
			cp.setQq(""+new Random().nextInt(99999));
			ps.addPerson(cp);
		}
	}
	
	public void testAddPersons02(){
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		ContactPersonService ps = (ContactPersonService)factory.getBean("personService");
		ps.addBatch();
	}
	
	public void testFindPersons(){
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		ContactPersonService ps = (ContactPersonService)factory.getBean("personService");
		
		long total = 0;
		for(int i=0; i<20; i++){
			long begin = System.currentTimeMillis();
			ps.findAllPersons();
			long end = System.currentTimeMillis();
			
			long duration = end - begin;
			System.out.println(duration);
			total += duration;
		}
		System.out.println("平均时间："+(total/20));
	}
}
