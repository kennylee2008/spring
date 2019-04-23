package cn.com.leadfar.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit38.AbstractJUnit38SpringContextTests;

import cn.com.leadfar.service.GroupService;

@ContextConfiguration("classpath:beans.xml")
public class GroupTest2 extends AbstractJUnit38SpringContextTests {
	public void testAddGroup(){
		GroupService gs = (GroupService)applicationContext.getBean("groupService");
		Group g = new Group("oioioio");
		gs.saveGroup(g);
		
	}
	
	public void testFindGroup(){
		GroupService gs = (GroupService)applicationContext.getBean("groupService");
		gs.findAllGroups();
	}
	
	public void testFindGroup02(){
		//BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		GroupService gs = (GroupService)applicationContext.getBean("groupService");
		Group g = gs.findGroup(1);
		System.out.println(g.getName());
	}
}
