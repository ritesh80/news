package org.pyr.news.hib.dao.scheduler;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.dao.CustomDaoSupport;

@Repository
@Transactional
public class AccountSchedulerDaoImpl extends CustomDaoSupport implements
		AccountSchedulerDao {

	@Autowired
	private SessionFactory sessionFactory;

}
