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
		
		//创建Hibenate Session
		Session session = HibernateUtil.openSession();
		
		try{
			//开启事务
			session.beginTransaction();
			
			groups = session.createQuery("from Group").list();
			
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
		
		return groups;
	}

}
