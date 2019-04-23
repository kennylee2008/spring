package cn.com.leadfar.spring.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.stereotype.Repository;

import cn.com.leadfar.spring.dao.GroupDao;
import cn.com.leadfar.spring.model.Group;
@Repository
public class GroupDaoImpl implements GroupDao {
	
	@Resource
	private BasicDataSource dataSource;
	
	@Override
	public int add(Group group) {
		int gid = 0;
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement pstmt = conn.prepareStatement("insert into t_group (name) values (?)",Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, group.getName());
			pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();
			if(rs.next()){
				gid = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return gid;
	}

}
