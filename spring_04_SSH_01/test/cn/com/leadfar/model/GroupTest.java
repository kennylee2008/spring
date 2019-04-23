package cn.com.leadfar.model;

import junit.framework.TestCase;

import org.hibernate.Session;

import cn.com.leadfar.util.HibernateUtil;

public class GroupTest extends TestCase {
	public void testAddGroup(){
		//����Hibenate Session
		Session session = HibernateUtil.openSession();
		
		try{
			//��������
			session.beginTransaction();
			
			Group g1 = new Group("����");
			session.save(g1);
			Group g2 = new Group("İ����");
			session.save(g2);
			
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
