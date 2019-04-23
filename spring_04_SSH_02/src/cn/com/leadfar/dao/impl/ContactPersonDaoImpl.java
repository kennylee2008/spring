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
		//创建Hibenate Session
		Session session = HibernateUtil.openSession();
		
		try{
			//开启事务
			session.beginTransaction();
			
			//增加其它的业务逻辑判断
			if(cp.getGroup() != null){
				if(cp.getGroup().getId() == 0){
					cp.setGroup(null);
				}else{
					int gid = cp.getGroup().getId();
					Group g = (Group)session.get(Group.class, gid);
					if(g == null){
						throw new RuntimeException("不能在一个不存在的组【"+gid+"】下面添加人员");
					}
				}
			}
			
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
	}

}
