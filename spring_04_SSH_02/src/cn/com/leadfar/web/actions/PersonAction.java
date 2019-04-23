package cn.com.leadfar.web.actions;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.leadfar.dao.ContactPersonDao;
import cn.com.leadfar.dao.GroupDao;
import cn.com.leadfar.model.ContactPerson;
import cn.com.leadfar.model.Group;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

public class PersonAction implements ModelDriven{
	
	private ContactPerson cp;
	
	private static GroupDao groupDao;
	
	private static ContactPersonDao personDao;
	
	static{
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		groupDao = (GroupDao)factory.getBean("groupDao");
		personDao = (ContactPersonDao)factory.getBean("personDao");
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
		List<Group> groups = groupDao.findAllGroups();
		
		ActionContext.getContext().put("groups", groups);
		
		return "add_input";
	}
	
	public String add(){
		
		personDao.save(cp);
		
		return "add_success";
	}
}
