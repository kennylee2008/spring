package cn.com.leadfar.service.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import cn.com.leadfar.dao.ContactPersonDao;
import cn.com.leadfar.dao.GroupDao;
import cn.com.leadfar.model.ContactPerson;
import cn.com.leadfar.model.Group;
import cn.com.leadfar.service.ContactPersonService;
import cn.com.leadfar.util.HibernateUtil;

@Service("personService")
public class ContactPersonServiceImpl implements ContactPersonService {

	@Resource
	private ContactPersonDao personDao;

	@Resource
	private GroupDao groupDao;

	@Override
	public void addPerson(ContactPerson cp) {

		// ����Hibenate Session
		Session session = HibernateUtil.openSession();

		try {
			// ��������
			session.beginTransaction();

			// ����������ҵ���߼��ж�
			if (cp.getGroup() != null) {
				if (cp.getGroup().getId() == 0) { // ���Group��id��0���򲻰�ContactPerson�ŵ�ĳ��Group��
					// cp.setGroup(null);

					if (!"".equals(cp.getGroup().getName())) {
						groupDao.save(cp.getGroup());
					}

				} else { // ���Group��id����0�������ж����Group�Ƿ���ڣ���������ڣ���һ���쳣��
					int gid = cp.getGroup().getId();
					Group g = groupDao.findById(gid);
					if (g == null) {
						throw new RuntimeException("������һ�������ڵ��顾" + gid
								+ "������������Ա");
					}
				}
			}

			if (personDao.findByName(cp.getName()) != null) {
				throw new RuntimeException("��Ҫ���ӵ���Ա�Ѿ����ڣ��������ظ����ӣ�");
			}

			personDao.save(cp);

			// �ύ����
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			// �����쳣����ع�����
			session.getTransaction().rollback();
		} finally {
			// �ر�session
			session.close();
		}
	}

}