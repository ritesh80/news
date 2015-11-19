package com.pyr.news.hib.dao.acnt;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.dao.CustomDaoSupport;

@Repository
@Transactional
public class RoleDaoImpl extends CustomDaoSupport implements RoleDao {

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * select * from ROLES limit initial,page; select * from ROLES where id=x;
	 * select * from ROLES where type="xyz"; select * from USER_ROLES us_rol
	 * join ROLES rol on (us_rol.role_id = rol.id) where us_rol.user_id = "xyz";
	 */

}
