package cn.com.leadfar.model;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.leadfar.service.GroupService;

public class GroupTest extends TestCase {
	public void testAddGroup(){
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		GroupService gs = (GroupService)factory.getBean("groupService");
		Group g = new Group("oioioio");
		gs.saveGroup(g);
	}
	
	public void testFindGroup(){
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		GroupService gs = (GroupService)factory.getBean("groupService");
		gs.findAllGroups();
	}
	
	public void testFindGroup02(){
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		GroupService gs = (GroupService)factory.getBean("groupService");
		Group g = gs.findGroup(1);
		System.out.println(g.getName());
	}
}
