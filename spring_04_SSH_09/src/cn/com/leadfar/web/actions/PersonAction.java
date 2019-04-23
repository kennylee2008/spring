package cn.com.leadfar.web.actions;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import cn.com.leadfar.model.ContactPerson;
import cn.com.leadfar.model.Group;
import cn.com.leadfar.service.ContactPersonService;
import cn.com.leadfar.service.GroupService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

@Controller("personAction")
public class PersonAction implements ModelDriven{
	
	private ContactPerson cp;
	
	@Resource
	private GroupService groupService;
	
	@Resource
	private ContactPersonService personService;
	
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
