package cn.com.leadfar.model;

import junit.framework.TestCase;

import org.hibernate.Session;

import cn.com.leadfar.util.HibernateUtil;

public class GroupTest extends TestCase {
	public void testAddGroup(){
		//创建Hibenate Session
		Session session = HibernateUtil.openSession();
		
		try{
			//开启事务
			session.beginTransaction();
			
			Group g1 = new Group("朋友");
			session.save(g1);
			Group g2 = new Group("陌生人");
			session.save(g2);
			
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
	}
}
