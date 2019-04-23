package cn.com.leadfar.spring.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ConnectionCallback;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import cn.com.leadfar.spring.dao.GroupDao;
import cn.com.leadfar.spring.model.Group;
@Repository
public class GroupDaoImpl extends JdbcDaoSupport implements GroupDao {
	
	@Resource
	public void setTheDataSource(DataSource ds){
		super.setDataSource(ds);
	}
	
	@Override
	public int add(final Group group) {
		return getJdbcTemplate().execute(
			new ConnectionCallback<Integer>(){

				@Override
				public Integer doInConnection(Connection conn)
						throws SQLException, DataAccessException {
					int gid = 0;
					PreparedStatement pstmt = conn.prepareStatement("insert into t_group (name) values (?)",Statement.RETURN_GENERATED_KEYS);
					pstmt.setString(1, group.getName());
					pstmt.executeUpdate();
					ResultSet rs = pstmt.getGeneratedKeys();
					if(rs.next()){
						gid = rs.getInt(1);
					}
					
					return gid;
				}
				
			}
		);
	}

}
