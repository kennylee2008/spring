package cn.com.leadfar.spring.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Repository;

import cn.com.leadfar.spring.dao.UserDao;
import cn.com.leadfar.spring.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Resource
	private BasicDataSource dataSource;
	
	@Override
	public void add(User user) {
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(
					"insert into t_person (name,gid) values (?,?)",
					Statement.RETURN_GENERATED_KEYS
					);
			pstmt.setString(1, user.getUsername());
			if(user.getGroup() != null && user.getGroup().getId() != 0){
				pstmt.setInt(2, user.getGroup().getId());
			}else{
				pstmt.setString(2, null);
			}
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void del(User user) {
		
	}

	@Override
	public void update(User user) {
		
	}
}
