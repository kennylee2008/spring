package cn.com.leadfar.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cn.com.leadfar.dao.GroupDao;
import cn.com.leadfar.model.Group;

@Repository("groupDao")
public class GroupDaoImpl implements GroupDao {

	@Resource
	private SessionFactory sessionFactory;
	
	@Override
	public List<Group> findAllGroups() {

		List<Group> groups = null;

		groups = getSession().createQuery("from Group").list();

		return groups;
	}

	@Override
	public Group findById(int gid) {
		Group g = null;

		g = (Group) getSession().get(Group.class, gid);

		return g;
	}

	@Override
	public void save(Group g) {

		getSession().save(g);

	}

	@Override
	public Group findByName(String name) {
		
		return (Group)getSession().createQuery("select g from Group g where g.name = ?")
			.setParameter(0, name)
			.uniqueResult();
		
	}
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}

}
