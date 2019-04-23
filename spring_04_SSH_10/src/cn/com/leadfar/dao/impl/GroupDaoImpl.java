package cn.com.leadfar.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.leadfar.dao.GroupDao;
import cn.com.leadfar.model.Group;

@Repository("groupDao")
public class GroupDaoImpl extends BaseDao implements GroupDao {

	@Override
	public List<Group> findAllGroups() {
		System.out.println(getSession().getFlushMode());
		List<Group> groups = null;

		groups = getSession().createQuery("from Group").list();

		return groups;
	}

	@Override
	public Group findById(int gid) {
		Group g = null;

		g = (Group) getSession().load(Group.class, gid);

		return g;
	}

	@Override
	public void save(Group g) {
		System.out.println(getSession().getFlushMode());
		getSession().save(g);

	}

	@Override
	public Group findByName(String name) {
		
		return (Group)getSession().createQuery("select g from Group g where g.name = ?")
			.setParameter(0, name)
			.uniqueResult();
		
	}

}
