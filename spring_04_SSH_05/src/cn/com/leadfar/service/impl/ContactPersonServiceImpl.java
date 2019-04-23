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

		// 创建Hibenate Session
		Session session = HibernateUtil.openSession();

		try {
			// 开启事务
			session.beginTransaction();

			// 增加其它的业务逻辑判断
			if (cp.getGroup() != null) {
				if (cp.getGroup().getId() == 0) { // 如果Group的id是0，则不把ContactPerson放到某个Group下
					// cp.setGroup(null);

					if (!"".equals(cp.getGroup().getName())) {
						groupDao.save(cp.getGroup());
					}

				} else { // 如果Group的id不是0，则先判断这个Group是否存在，如果不存在，报一个异常！
					int gid = cp.getGroup().getId();
					Group g = groupDao.findById(gid);
					if (g == null) {
						throw new RuntimeException("不能在一个不存在的组【" + gid
								+ "】下面添加人员");
					}
				}
			}

			if (personDao.findByName(cp.getName()) != null) {
				throw new RuntimeException("您要添加的人员已经存在，不允许重复添加！");
			}

			personDao.save(cp);

			// 提交事务
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			// 出现异常，需回滚事务
			session.getTransaction().rollback();
		} finally {
			// 关闭session
			session.close();
		}
	}

}
