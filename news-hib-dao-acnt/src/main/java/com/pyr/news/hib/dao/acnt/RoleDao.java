package com.pyr.news.hib.dao.acnt;

import com.pyr.news.hib.model.acnt.Role;

public interface RoleDao {
	public void addRole(Role role);
	
	public void updateRole(Role role);
	
	public void removeRole(Role role);
	
	public Role getRole(int roleID);
}
