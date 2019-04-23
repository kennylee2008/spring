package cn.com.leadfar.web.actions;

import java.util.List;

import org.hibernate.Session;

import cn.com.leadfar.model.ContactPerson;
import cn.com.leadfar.util.HibernateUtil;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

public class PersonAction implements ModelDriven{
	
	private ContactPerson cp;
	
	@Override
	public Object getModel() {
		if(cp == null){
			cp = new ContactPerson();
		}
		return cp;
	}

	public String addInput(){
		
		//查询Group列表，传到add_input.jsp界面
		
		//创建Hibenate Session
		Session session = HibernateUtil.openSession();
		
		try{
			//开启事务
			session.beginTransaction();
			
			List groups = session.createQuery("from Group").list();
			
			ActionContext.getContext().put("groups", groups);
			
			//提交事务
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			//出现异常，需回滚事务
			session.getTransaction().rollback();
		}finally{
			//关闭session
			session.close(); 
		}
		
		return "add_input";
	}
	
	public String add(){
		
		//创建Hibenate Session
		Session session = HibernateUtil.openSession();
		
		try{
			//开启事务
			session.beginTransaction();
			
			session.save(cp);
			
			//提交事务
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			//出现异常，需回滚事务
			session.getTransaction().rollback();
		}finally{
			//关闭session
			session.close(); 
		}		
		
		return "add_success";
	}
}
