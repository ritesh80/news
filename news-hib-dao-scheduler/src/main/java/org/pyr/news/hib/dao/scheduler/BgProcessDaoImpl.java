package org.pyr.news.hib.dao.scheduler;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.scheduler.BgProcess;

@Repository
@Transactional
public class BgProcessDaoImpl implements BgProcessDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addBgProcess(BgProcess bgProcess){
		sessionFactory.getCurrentSession().save(bgProcess);
	}
	
	public void updateBgProcess(BgProcess bgProcess){
		sessionFactory.getCurrentSession().saveOrUpdate(bgProcess);
	}
	
	public void removeBgProcess(BgProcess bgProcess){
		sessionFactory.getCurrentSession().delete(bgProcess);
	}
	
	public BgProcess getBgProcess(int bgProcessID){
		return (BgProcess) sessionFactory.getCurrentSession().createSQLQuery("select * form BGPROCESS where id="+ bgProcessID);
	}
}
