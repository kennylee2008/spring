package cn.com.leadfar.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import cn.com.leadfar.dao.GroupDao;
import cn.com.leadfar.model.Group;
import cn.com.leadfar.util.HibernateUtil;

@Repository("groupDao")
public class GroupDaoImpl implements GroupDao {

	@Override
	public List<Group> findAllGroups() {
		
		List<Group> groups = null;
		
		//����Hibenate Session
		Session session = HibernateUtil.openSession();
		
		try{
			//��������
			session.beginTransaction();
			
			groups = session.createQuery("from Group").list();
			
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
		
		return groups;
	}

	@Override
	public Group findById(int gid) {
		//����Hibenate Session
		Session session = HibernateUtil.openSession();
		Group g = null;
		try{
			//��������
			session.beginTransaction();
			
			g = (Group)session.get(Group.class, gid);
			
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
		return g;
	}

	@Override
	public void save(Group g) {
		Session session = HibernateUtil.openSession();

		try{
			//��������
			session.beginTransaction();
			
			session.save(g);
			
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

}
