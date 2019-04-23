package cn.com.leadfar.service;

import java.util.List;

import cn.com.leadfar.model.Group;

public interface GroupService {
	public List<Group> findAllGroups();
	public Group saveGroup(Group g);
}
