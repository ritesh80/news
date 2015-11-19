package com.pyr.news.hib.dao.acnt;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.dao.CustomDaoSupport;

@Repository
@Transactional
public class UserDaoImpl extends CustomDaoSupport implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * select * from USER where login="xyz"; select * from USER limit initial,
	 * page; select count(*) from USER; select * from USER where id=x; select *
	 * from USER where login="xyz"; select count(*) or usr.* from USER usr join
	 * USER_ROLES us_rol ON (usr.id = us_rol.user_id) join ROLES rol on
	 * (us_rol.role_id=rol.id) where rol.type = "xyz";
	 */
}
