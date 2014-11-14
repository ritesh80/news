package org.pyr.news.hib.dao.scheduler;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.scheduler.Scheduler;
@Repository
@Transactional
public class SchedulerDaoImpl implements SchedulerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addScheduler(Scheduler scheduler){
		sessionFactory.getCurrentSession().save(scheduler);
	}
	
	public void updateScheduler(Scheduler scheduler){
		sessionFactory.getCurrentSession().saveOrUpdate(scheduler);
	}
	
	public void removeScheduler(Scheduler scheduler){
		sessionFactory.getCurrentSession().delete(scheduler);
	}
	
	public Scheduler getScheduler(int schedulerID){
		return (Scheduler)sessionFactory.getCurrentSession().createSQLQuery("select * from Scheduler where id="+schedulerID);
	}
}
