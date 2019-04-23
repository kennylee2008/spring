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

		// 创建Hibenate Session
		Session session = HibernateUtil.currentSession();

		groups = session.createQuery("from Group").list();

		return groups;
	}

	@Override
	public Group findById(int gid) {
		// 创建Hibenate Session
		Session session = HibernateUtil.currentSession();
		Group g = null;

		g = (Group) session.get(Group.class, gid);

		return g;
	}

	@Override
	public void save(Group g) {
		Session session = HibernateUtil.currentSession();

		session.save(g);

	}

}
