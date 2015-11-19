package com.pyr.news.service.scheduler;

import org.pyr.news.hib.dao.scheduler.AccountSchedulerDao;
import org.pyr.news.hib.dao.scheduler.BgProcessDao;
import org.pyr.news.hib.dao.scheduler.SchedulerDao;
import org.springframework.beans.factory.annotation.Autowired;

import com.pyr.news.hib.model.scheduler.AccountScheduler;
import com.pyr.news.hib.model.scheduler.BgProcess;
import com.pyr.news.hib.model.scheduler.Scheduler;

//@Service
public class SchedulerServiceImpl implements ScheculerService {

	// @Autowired
	private SchedulerDao scheduleDaoImpl;

	// @Autowired
	private AccountSchedulerDao accntScheduleDao;

	// @Autowired
	private BgProcessDao bgProcessDaoImpl;

	@Autowired
	public SchedulerDao getScheduleDaoImpl() {
		return scheduleDaoImpl;
	}

	public void setScheduleDaoImpl(SchedulerDao scheduleDaoImpl) {
		this.scheduleDaoImpl = scheduleDaoImpl;
	}

	@Autowired
	public AccountSchedulerDao getAccntScheduleDao() {
		return accntScheduleDao;
	}

	public void setAccntScheduleDao(AccountSchedulerDao accntScheduleDao) {
		this.accntScheduleDao = accntScheduleDao;
	}

	@Autowired
	public BgProcessDao getBgProcessDaoImpl() {
		return bgProcessDaoImpl;
	}

	public void setBgProcessDaoImpl(BgProcessDao bgProcessDaoImpl) {
		this.bgProcessDaoImpl = bgProcessDaoImpl;
	}

	public void addScheduler(Scheduler scheduler) {
		scheduleDaoImpl.insert(scheduler);
	}

	public void updateScheduler(Scheduler scheduler) {
		scheduleDaoImpl.update(scheduler);
	}

	public void removeScheduler(Scheduler scheduler) {
		scheduleDaoImpl.remove(scheduler);
	}

	public Scheduler getScheduler(int schedulerID) {
		return (Scheduler) scheduleDaoImpl.get(Scheduler.class, schedulerID);
	}

	public void addBgProcess(BgProcess bgProcess) {
		bgProcessDaoImpl.insert(bgProcess);
	}

	public void updateBgProcess(BgProcess bgProcess) {
		bgProcessDaoImpl.update(bgProcess);
	}

	public void removeBgProcess(BgProcess bgProcess) {
		bgProcessDaoImpl.remove(bgProcess);
	}

	public BgProcess getBgProcess(int bgProcessID) {
		return (BgProcess) bgProcessDaoImpl.get(BgProcess.class, bgProcessID);
	}

	public void addAccountSchedule(AccountScheduler accountSchedule) {
		accntScheduleDao.insert(accountSchedule);
	}

	public void updateAccountSchedule(AccountScheduler accountSchedule) {
		accntScheduleDao.update(accountSchedule);
	}

	public void removeAccountSchedule(AccountScheduler accountSchedule) {
		accntScheduleDao.remove(accountSchedule);
	}

	public AccountScheduler getAccountSchedule(int accountScheduleID) {
		return (AccountScheduler) accntScheduleDao.get(AccountScheduler.class,
				accountScheduleID);
	}

}
