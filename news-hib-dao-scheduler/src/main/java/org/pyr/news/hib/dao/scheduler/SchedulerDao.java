package org.pyr.news.hib.dao.scheduler;

import com.pyr.news.hib.model.scheduler.Scheduler;

public interface SchedulerDao {
	public void addScheduler(Scheduler scheduler);
	
	public void updateScheduler(Scheduler scheduler);
	
	public void removeScheduler(Scheduler scheduler);
	
	public Scheduler getScheduler(int schedulerID);
}
