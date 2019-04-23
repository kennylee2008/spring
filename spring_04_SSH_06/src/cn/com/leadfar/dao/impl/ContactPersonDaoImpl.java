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
		// 创建Hibenate Session
		Session session = HibernateUtil.currentSession();

		session.save(cp);

	}

	@Override
	public ContactPerson findByName(String name) {

		ContactPerson p = null;
		// 创建Hibenate Session
		Session session = HibernateUtil.currentSession();

		p = (ContactPerson) session.createQuery(
				"select p from ContactPerson p where p.name = ?").setParameter(
				0, name).uniqueResult();

		return p;
	}

}
