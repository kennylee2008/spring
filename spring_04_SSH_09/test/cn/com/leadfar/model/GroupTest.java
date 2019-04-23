package cn.com.leadfar.model;

import junit.framework.TestCase;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.leadfar.service.GroupService;

public class GroupTest extends TestCase {
	public void testAddGroup(){
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		GroupService gs = (GroupService)factory.getBean("groupService");
		Group g = new Group("xxxxxxxx");
		gs.saveGroup(g);
	}
}
