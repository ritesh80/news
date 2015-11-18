package org.pyr.news.hib.dao.scheduler;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.scheduler.Scheduler;

@Repository
@Transactional
public class SchedulerDaoImpl implements SchedulerDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate template;

	public void addScheduler(Scheduler scheduler) {
		template.save(scheduler);
	}

	public void updateScheduler(Scheduler scheduler) {
		template.saveOrUpdate(scheduler);
	}

	public void removeScheduler(Scheduler scheduler) {
		template.delete(scheduler);
	}

	public Scheduler getScheduler(int schedulerID) {
		return (Scheduler) template
				.getSessionFactory()
				.getCurrentSession()
				.createSQLQuery(
						"select * from Scheduler where id=" + schedulerID);
	}
}
