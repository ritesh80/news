package com.pyr.news.hib.dao.acnt;

import com.pyr.news.hib.model.acnt.User;

public interface UserDao {
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void removeUser(User user);
	
	public User getUser(int userID);
}
