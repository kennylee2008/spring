package cn.com.leadfar.service;

import java.util.List;

import cn.com.leadfar.model.ContactPerson;

public interface ContactPersonService {
	public void addPerson(ContactPerson cp);
	public List findAllPersons();
	public void addBatch();
}
