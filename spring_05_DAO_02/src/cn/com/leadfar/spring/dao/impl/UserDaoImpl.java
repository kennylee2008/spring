package cn.com.leadfar.spring.dao.impl;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import cn.com.leadfar.spring.dao.UserDao;
import cn.com.leadfar.spring.model.User;

@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
	
	@Resource
	public void setTheDataSource(DataSource ds){
		super.setDataSource(ds);
	}	
	
	@Override
	public void add(User user) {
		
		if(user.getGroup() == null || user.getGroup().getId() == 0){
			getJdbcTemplate().update("insert into t_person (name) values (?)",
					user.getUsername());
		}else{
			getJdbcTemplate().update("insert into t_person (name,gid) values (?,?)",
					user.getUsername(),user.getGroup().getId());
		}
		
		
	}

	@Override
	public void del(User user) {
		
	}

	@Override
	public void update(User user) {
		
	}
}
