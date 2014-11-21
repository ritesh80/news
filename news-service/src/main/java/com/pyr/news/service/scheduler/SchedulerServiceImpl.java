package com.pyr.news.service.scheduler;

import org.pyr.news.hib.dao.scheduler.AccountSchedulerDao;
import org.pyr.news.hib.dao.scheduler.BgProcessDao;
import org.pyr.news.hib.dao.scheduler.SchedulerDao;
import org.pyr.news.hib.dao.scheduler.SchedulerDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pyr.news.hib.model.scheduler.AccountScheduler;
import com.pyr.news.hib.model.scheduler.BgProcess;
import com.pyr.news.hib.model.scheduler.Scheduler;
@Service
public class SchedulerServiceImpl implements ScheculerService {

		@Autowired
		private SchedulerDao scheduleDaoImpl;
		
		@Autowired
		private AccountSchedulerDao accntScheduleDao;
		
		@Autowired
		private BgProcessDao bgProcessDaoImpl;
		
		public void addScheduler(Scheduler scheduler){
			scheduleDaoImpl.addScheduler(scheduler);
		}
		
		public void updateScheduler(Scheduler scheduler){
			scheduleDaoImpl.updateScheduler(scheduler);
		}
		
		public void removeScheduler(Scheduler scheduler){
			scheduleDaoImpl.removeScheduler(scheduler);
		}
		
		public Scheduler getScheduler(int schedulerID){
			return scheduleDaoImpl.getScheduler(schedulerID);
		}
		
		public void addBgProcess(BgProcess bgProcess){
			bgProcessDaoImpl.addBgProcess(bgProcess);
		}
		
		public void updateBgProcess(BgProcess bgProcess){
			bgProcessDaoImpl.updateBgProcess(bgProcess);
		}
		
		public void removeBgProcess(BgProcess bgProcess){
			bgProcessDaoImpl.removeBgProcess(bgProcess);
		}
		
		public BgProcess getBgProcess(int bgProcessID){
			return bgProcessDaoImpl.getBgProcess(bgProcessID);
		}
		
		public void addAccountSchedule(AccountScheduler accountSchedule){
			accntScheduleDao.addAccountSchedule(accountSchedule);
		}
		
		public void updateAccountSchedule(AccountScheduler accountSchedule){
			accntScheduleDao.updateAccountSchedule(accountSchedule);
		}
		
		public void removeAccountSchedule(AccountScheduler accountSchedule){
			accntScheduleDao.removeAccountSchedule(accountSchedule);
		}
		
		public AccountScheduler getAccountSchedule(int accountScheduleID){
			return accntScheduleDao.getAccountSchedule(accountScheduleID);
		}
		
}
