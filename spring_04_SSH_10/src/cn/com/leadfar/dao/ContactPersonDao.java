package cn.com.leadfar.dao;

import java.util.List;

import cn.com.leadfar.model.ContactPerson;

public interface ContactPersonDao {
	public void save(ContactPerson cp);
	public ContactPerson findByName(String name);
	public List findAll();
	public void saveBatch();
}
