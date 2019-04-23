package cn.com.leadfar.web.actions;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.leadfar.dao.ContactPersonDao;
import cn.com.leadfar.dao.GroupDao;
import cn.com.leadfar.model.ContactPerson;
import cn.com.leadfar.model.Group;
import cn.com.leadfar.service.ContactPersonService;
import cn.com.leadfar.service.GroupService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

public class PersonAction implements ModelDriven{
	
	private ContactPerson cp;
	
	private static GroupService groupService;
	
	private static ContactPersonService personService;
	
	static{
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		groupService = (GroupService)factory.getBean("groupService");
		personService = (ContactPersonService)factory.getBean("personService");
	}
	
	@Override
	public Object getModel() {
		if(cp == null){
			cp = new ContactPerson();
		}
		return cp;
	}

	public String addInput(){
		
		//查询Group列表，传到add_input.jsp界面
		List<Group> groups = groupService.findAllGroups();
		
		ActionContext.getContext().put("groups", groups);
		
		return "add_input";
	}
	
	public String add(){
		
		personService.addPerson(cp);
		
		return "add_success";
	}
}
