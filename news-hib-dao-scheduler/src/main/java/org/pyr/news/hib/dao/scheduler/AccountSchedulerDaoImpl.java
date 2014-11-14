package org.pyr.news.hib.dao.scheduler;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.scheduler.AccountScheduler;

@Repository
@Transactional
public class AccountSchedulerDaoImpl implements AccountSchedulerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addAccountSchedule(AccountScheduler accountSchedule){
		sessionFactory.getCurrentSession().save(accountSchedule);
	}
	
	public void updateAccountSchedule(AccountScheduler accountSchedule){
		sessionFactory.getCurrentSession().saveOrUpdate(accountSchedule);
	}
	
	public void removeAccountSchedule(AccountScheduler accountSchedule){
		sessionFactory.getCurrentSession().delete(accountSchedule);
	}
	
	public AccountScheduler getAccountSchedule(int accountScheduleID){
		return (AccountScheduler)sessionFactory.getCurrentSession().createQuery("select * from ACCOUNT_SCHEDULER where id"+accountScheduleID);
	}
}
