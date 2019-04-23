package cn.com.leadfar.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cn.com.leadfar.dao.ContactPersonDao;
import cn.com.leadfar.model.ContactPerson;

@Repository("personDao")
public class ContactPersonDaoImpl implements ContactPersonDao {

	@Resource
	private SessionFactory sessionFactory;
	
	@Override
	public void save(ContactPerson cp) {

		getSession().save(cp);

	}

	@Override
	public ContactPerson findByName(String name) {

		ContactPerson p = null;

		p = (ContactPerson) getSession().createQuery(
				"select p from ContactPerson p where p.name = ?").setParameter(
				0, name).uniqueResult();

		return p;
	}
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}

}
