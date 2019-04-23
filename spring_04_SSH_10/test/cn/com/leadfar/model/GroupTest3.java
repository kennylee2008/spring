package cn.com.leadfar.model;

import javax.annotation.Resource;

import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit38.AbstractTransactionalJUnit38SpringContextTests;

import cn.com.leadfar.service.GroupService;

@ContextConfiguration("classpath:beans.xml")
public class GroupTest3 extends AbstractTransactionalJUnit38SpringContextTests {
	
	@Resource
	private GroupService gs;
	
	@Rollback(false)
	public void testAddGroup(){
		GroupService gs = (GroupService)applicationContext.getBean("groupService");
		Group g = new Group("oioioio");
		gs.saveGroup(g);
		
	}
	
	public void testFindGroup(){
		//GroupService gs = (GroupService)applicationContext.getBean("groupService");
		gs.findAllGroups();
	}
	
	public void testFindGroup02(){
		//BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		//GroupService gs = (GroupService)applicationContext.getBean("groupService");
		Group g = gs.findGroup(1);
		System.out.println(g.getName());
	}
}
