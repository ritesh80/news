package org.pyr.news.hib.dao.scheduler;

import com.pyr.news.hib.model.scheduler.AccountScheduler;

public interface AccountSchedulerDao {
	public void addAccountSchedule(AccountScheduler accountSchedule);
	
	public void updateAccountSchedule(AccountScheduler accountSchedule);
	
	public void removeAccountSchedule(AccountScheduler accountSchedule);
	
	public AccountScheduler getAccountSchedule(int accountScheduleID);
}
