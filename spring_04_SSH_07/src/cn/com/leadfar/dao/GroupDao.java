package cn.com.leadfar.dao;

import java.util.List;

import cn.com.leadfar.model.Group;

public interface GroupDao {
	public List<Group> findAllGroups();
	public Group findById(int gid);
	public Group findByName(String name);
	public void save(Group g);
}
