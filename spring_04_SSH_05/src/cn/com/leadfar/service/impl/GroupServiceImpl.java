package cn.com.leadfar.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import cn.com.leadfar.dao.GroupDao;
import cn.com.leadfar.model.Group;
import cn.com.leadfar.service.GroupService;
import cn.com.leadfar.util.HibernateUtil;

@Service("groupService")
public class GroupServiceImpl implements GroupService {

	@Resource
	private GroupDao groupDao;

	@Override
	public List<Group> findAllGroups() {
		List<Group> groups = null;
		// 创建Hibenate Session
		Session session = HibernateUtil.openSession();

		try {
			// 开启事务
			session.beginTransaction();

			groups = groupDao.findAllGroups();

			// 提交事务
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			// 出现异常，需回滚事务
			session.getTransaction().rollback();
		} finally {
			// 关闭session
			session.close();
		}
		return groups;
	}

}
