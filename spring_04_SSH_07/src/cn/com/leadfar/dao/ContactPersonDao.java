package cn.com.leadfar.dao;

import cn.com.leadfar.model.ContactPerson;

public interface ContactPersonDao {
	public void save(ContactPerson cp);
	public ContactPerson findByName(String name);
}
