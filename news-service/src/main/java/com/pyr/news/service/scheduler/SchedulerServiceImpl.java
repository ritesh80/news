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
		private SchedulerDao scheduleDao;
		
		@Autowired
		private AccountSchedulerDao accntScheduleDao;
		
		@Autowired
		private BgProcessDao bgProcessDao;
		
		public void addScheduler(Scheduler scheduler){
			scheduleDao.addScheduler(scheduler);
		}
		
		public void updateScheduler(Scheduler scheduler){
			scheduleDao.updateScheduler(scheduler);
		}
		
		public void removeScheduler(Scheduler scheduler){
			scheduleDao.removeScheduler(scheduler);
		}
		
		public Scheduler getScheduler(int schedulerID){
			return scheduleDao.getScheduler(schedulerID);
		}
		
		public void addBgProcess(BgProcess bgProcess){
			bgProcessDao.addBgProcess(bgProcess);
		}
		
		public void updateBgProcess(BgProcess bgProcess){
			bgProcessDao.updateBgProcess(bgProcess);
		}
		
		public void removeBgProcess(BgProcess bgProcess){
			bgProcessDao.removeBgProcess(bgProcess);
		}
		
		public BgProcess getBgProcess(int bgProcessID){
			return bgProcessDao.getBgProcess(bgProcessID);
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
