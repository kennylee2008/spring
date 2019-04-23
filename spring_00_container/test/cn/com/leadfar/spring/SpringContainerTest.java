package cn.com.leadfar.spring;

import cn.com.leadfar.services.RoleService;
import junit.framework.TestCase;

public class SpringContainerTest extends TestCase {
	public void testBean01() throws Exception{
		BeanFactory factory = new BeanFactory("beans.xml");
		
		RoleService roleService = (RoleService)factory.getBean("roleService");
		
		roleService.someBusinessMethod1();
		
	}
}
