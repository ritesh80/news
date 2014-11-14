package com.pyr.news.service.scheduler;

import com.pyr.news.hib.model.scheduler.AccountScheduler;
import com.pyr.news.hib.model.scheduler.BgProcess;
import com.pyr.news.hib.model.scheduler.Scheduler;

public interface ScheculerService {
	public void addScheduler(Scheduler scheduler);
	
	public void updateScheduler(Scheduler scheduler);
	
	public void removeScheduler(Scheduler scheduler);
	
	public Scheduler getScheduler(int schedulerID);
	
	public void addBgProcess(BgProcess bgProcess);
	
	public void updateBgProcess(BgProcess bgProcess);
	
	public void removeBgProcess(BgProcess bgProcess);
	
	public BgProcess getBgProcess(int bgProcessID);
	
	public void addAccountSchedule(AccountScheduler accountSchedule);
	
	public void updateAccountSchedule(AccountScheduler accountSchedule);
	
	public void removeAccountSchedule(AccountScheduler accountSchedule);
	
	public AccountScheduler getAccountSchedule(int accountScheduleID);
}
