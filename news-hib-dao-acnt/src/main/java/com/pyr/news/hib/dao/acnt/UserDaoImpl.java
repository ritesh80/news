package com.pyr.news.hib.dao.acnt;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.acnt.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addUser(User user){
		sessionFactory.getCurrentSession().save(user);
	}
	
	public void updateUser(User user){
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}
	
	public void removeUser(User user){
		sessionFactory.getCurrentSession().delete(user);
	}
	
	public User getUser(int userID){
		return (User)sessionFactory.getCurrentSession().get(User.class, userID);
	}
}
