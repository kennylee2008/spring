package cn.com.leadfar.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.leadfar.dao.ContactPersonDao;
import cn.com.leadfar.dao.GroupDao;
import cn.com.leadfar.model.ContactPerson;
import cn.com.leadfar.model.Group;
import cn.com.leadfar.service.ContactPersonService;
import cn.com.leadfar.service.GroupService;

@Service("personService")
public class ContactPersonServiceImpl implements ContactPersonService {

	@Resource
	private ContactPersonDao personDao;

	@Resource
	private GroupDao groupDao;

	@Resource
	private GroupService groupService;
	
	@Override
	public void addPerson(ContactPerson cp) {

		// ����������ҵ���߼��ж�
		if (cp.getGroup() != null) {
			if (cp.getGroup().getId() == 0) { // ���Group��id��0���򲻰�ContactPerson�ŵ�ĳ��Group��
				// cp.setGroup(null);

				if (!"".equals(cp.getGroup().getName())) {
					//groupDao.save(cp.getGroup());
					Group g = groupService.saveGroup(cp.getGroup());
					cp.setGroup(g);
				}

			} else { // ���Group��id����0�������ж����Group�Ƿ���ڣ���������ڣ���һ���쳣��
				int gid = cp.getGroup().getId();
				Group g = groupDao.findById(gid);
				if (g == null) {
					throw new RuntimeException("������һ�������ڵ��顾" + gid
							+ "�����������Ա");
				}
			}
		}

		if (personDao.findByName(cp.getName()) != null) {
			throw new RuntimeException("��Ҫ��ӵ���Ա�Ѿ����ڣ��������ظ���ӣ�");
		}

		personDao.save(cp);

	}

	@Override
	public void addBatch() {
		personDao.saveBatch();
	}

	@Override
	public List findAllPersons() {
		return personDao.findAll();
	}

}
