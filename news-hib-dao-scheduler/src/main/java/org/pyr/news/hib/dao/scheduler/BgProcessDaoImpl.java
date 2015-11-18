package org.pyr.news.hib.dao.scheduler;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.scheduler.BgProcess;

@Repository
@Transactional
public class BgProcessDaoImpl implements BgProcessDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate template;

	public void addBgProcess(BgProcess bgProcess) {
		template.save(bgProcess);
	}

	public void updateBgProcess(BgProcess bgProcess) {
		template.saveOrUpdate(bgProcess);
	}

	public void removeBgProcess(BgProcess bgProcess) {
		template.delete(bgProcess);
	}

	public BgProcess getBgProcess(int bgProcessID) {
		return (BgProcess) template
				.getSessionFactory()
				.getCurrentSession()
				.createSQLQuery(
						"select * form BGPROCESS where id=" + bgProcessID);
	}
}
