package com.pyr.news.hib.dao.acnt;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.acnt.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate template;

	public void addUser(User user) {
		template.save(user);
	}

	public void updateUser(User user) {
		template.saveOrUpdate(user);
	}

	public void removeUser(User user) {
		template.delete(user);
	}

	public User getUser(int userID) {
		return (User) template.get(User.class, userID);
	}
	/*
	 * select * from USER where login="xyz"; select * from USER limit initial,
	 * page; select count(*) from USER; select * from USER where id=x; select *
	 * from USER where login="xyz"; select count(*) or usr.* from USER usr join
	 * USER_ROLES us_rol ON (usr.id = us_rol.user_id) join ROLES rol on
	 * (us_rol.role_id=rol.id) where rol.type = "xyz";
	 */
}
