package org.pyr.news.hib.dao.scheduler;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.scheduler.AccountScheduler;

@Repository
@Transactional
public class AccountSchedulerDaoImpl implements AccountSchedulerDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate template;

	public void addAccountSchedule(AccountScheduler accountSchedule) {
		template.save(accountSchedule);
	}

	public void updateAccountSchedule(AccountScheduler accountSchedule) {
		template.saveOrUpdate(accountSchedule);
	}

	public void removeAccountSchedule(AccountScheduler accountSchedule) {
		template.delete(accountSchedule);
	}

	public AccountScheduler getAccountSchedule(int accountScheduleID) {
		return (AccountScheduler) template
				.getSessionFactory()
				.getCurrentSession()
				.createQuery(
						"select * from ACCOUNT_SCHEDULER where id"
								+ accountScheduleID);
	}
}
