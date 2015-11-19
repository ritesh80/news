package com.pyr.news.hib.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

public class CustomDaoSupport extends HibernateDaoSupport implements InitDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void insert(Object obj) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(obj);
	}

	public void update(Object obj) {
		// TODO Auto-generated method stub
		getHibernateTemplate().saveOrUpdate(obj);

	}

	public void remove(Object obj) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(obj);

	}

	public Object get(Class<?> c, int shortint) {
		return (Class<?>) getHibernateTemplate().get(c, shortint);
	}

}
