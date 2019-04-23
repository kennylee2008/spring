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
			
			//����������ҵ���߼��ж�
			if(cp.getGroup() != null){
				if(cp.getGroup().getId() == 0){
					cp.setGroup(null);
				}else{
					int gid = cp.getGroup().getId();
					Group g = (Group)session.get(Group.class, gid);
					if(g == null){
						throw new RuntimeException("������һ�������ڵ��顾"+gid+"�����������Ա");
					}
				}
			}
			
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

}
