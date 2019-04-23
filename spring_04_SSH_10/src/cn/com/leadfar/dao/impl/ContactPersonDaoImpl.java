package cn.com.leadfar.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.com.leadfar.dao.ContactPersonDao;
import cn.com.leadfar.model.ContactPerson;

@Repository("personDao")
public class ContactPersonDaoImpl extends BaseDao implements ContactPersonDao {

	@Override
	public void save(ContactPerson cp) {
		getSession().save(cp);
	}

	@Override
	public void saveBatch() {
		for(int i=1; i<100000; i++){
			ContactPerson cp = new ContactPerson("²âÊÔÈËÔ±"+i);
			cp.setId(i);
			getSession().save(cp);
			if(i % 50 == 0){
				getSession().flush();
				getSession().clear();
			}
		}
	}

	@Override
	public List findAll() {
		return getSession().createQuery("from ContactPerson").list();
	}

	@Override
	public ContactPerson findByName(String name) {

		ContactPerson p = null;

		p = (ContactPerson) getSession().createQuery(
				"select p from ContactPerson p where p.name = ?").setParameter(
				0, name).uniqueResult();

		return p;
	}
}
