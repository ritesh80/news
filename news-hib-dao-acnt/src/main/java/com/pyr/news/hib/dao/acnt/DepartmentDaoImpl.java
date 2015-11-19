package com.pyr.news.hib.dao.acnt;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.dao.CustomDaoSupport;

@Repository
@Transactional
public class DepartmentDaoImpl extends CustomDaoSupport implements
		DepartmentDao {

	@Autowired
	private SessionFactory sessionFactory;

}
