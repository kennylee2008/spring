package cn.com.leadfar.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import cn.com.leadfar.dao.GroupDao;
import cn.com.leadfar.model.Group;
import cn.com.leadfar.service.GroupService;
import cn.com.leadfar.util.HibernateUtil;

@Service("groupService")
public class GroupServiceImpl implements GroupService {

	@Resource
	private GroupDao groupDao;

	@Override
	public List<Group> findAllGroups() {
		List<Group> groups = null;
		// ����Hibenate Session
		Session session = HibernateUtil.currentSession();

		try {
			// ��������
			session.beginTransaction();

			groups = groupDao.findAllGroups();

			// �ύ����
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			// �����쳣����ع�����
			session.getTransaction().rollback();
		} finally {
			// �ر�session
			if(session.isOpen()){
				session.close();
			}
		}
		return groups;
	}

	@Override
	public Group saveGroup(Group g) {
		// ����Hibenate Session
		Session session = HibernateUtil.currentSession();
		Group returnGroup = null;
//		try {
//			// ��������
//			session.beginTransaction();

			Group oldGroup = groupDao.findByName(g.getName());
			
			if(oldGroup == null){
				groupDao.save(g);
				returnGroup = g;
			}
			
			returnGroup = oldGroup;
			
			// �ύ����
//			session.getTransaction().commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//			// �����쳣����ع�����
//			session.getTransaction().rollback();
//		} finally {
//			// �ر�session
//			if(session.isOpen()){
//				session.close();
//			}
//		}
		return returnGroup;
	}

}
