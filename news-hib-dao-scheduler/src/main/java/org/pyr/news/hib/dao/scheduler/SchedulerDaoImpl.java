package org.pyr.news.hib.dao.scheduler;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.dao.CustomDaoSupport;
import com.pyr.news.hib.model.scheduler.Scheduler;

@Repository
@Transactional
public class SchedulerDaoImpl extends CustomDaoSupport implements SchedulerDao {

	@Autowired
	private SessionFactory sessionFactory;

}
