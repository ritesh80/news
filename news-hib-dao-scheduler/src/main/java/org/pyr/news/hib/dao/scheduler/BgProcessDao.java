package org.pyr.news.hib.dao.scheduler;

import com.pyr.news.hib.model.scheduler.BgProcess;

public interface BgProcessDao {
	public void addBgProcess(BgProcess bgProcess);
	
	public void updateBgProcess(BgProcess bgProcess);
	
	public void removeBgProcess(BgProcess bgProcess);
	
	public BgProcess getBgProcess(int bgProcessID);
}
