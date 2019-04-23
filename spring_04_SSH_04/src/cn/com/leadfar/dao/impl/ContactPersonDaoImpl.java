package cn.com.leadfar.dao.impl;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import cn.com.leadfar.dao.ContactPersonDao;
import cn.com.leadfar.model.ContactPerson;
import cn.com.leadfar.model.Group;
import cn.com.leadfar.util.HibernateUtil;

@Repository("personDao")
public class ContactPersonDaoImpl implements ContactPersonDao {

	@Override
	public void save(ContactPerson cp) {
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
	}

	@Override
	public ContactPerson findByName(String name) {
		
		ContactPerson p = null;
		//����Hibenate Session
		Session session = HibernateUtil.openSession();
		
		try{
			//��������
			session.beginTransaction();
			
			
			p = (ContactPerson)session.createQuery("select p from ContactPerson p where p.name = ?")
				.setParameter(0, name)
				.uniqueResult();
			
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
		return p;
	}

}
