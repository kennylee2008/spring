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
		
		//��ѯGroup�б�����add_input.jsp����
		
		//����Hibenate Session
		Session session = HibernateUtil.openSession();
		
		try{
			//��������
			session.beginTransaction();
			
			List groups = session.createQuery("from Group").list();
			
			ActionContext.getContext().put("groups", groups);
			
			//�ύ����
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			//�����쳣����ع�����
			session.getTransaction().rollback();
		}finally{
			//�ر�session
			session.close(); 
		}
		
		return "add_input";
	}
	
	public String add(){
		
		//����Hibenate Session
		Session session = HibernateUtil.openSession();
		
		try{
			//��������
			session.beginTransaction();
			
			session.save(cp);
			
			//�ύ����
			session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			//�����쳣����ع�����
			session.getTransaction().rollback();
		}finally{
			//�ر�session
			session.close(); 
		}		
		
		return "add_success";
	}
}
