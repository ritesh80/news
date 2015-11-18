package org.pyr.news.hib.dao.advertise;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.advertise.Advertise;

@Repository
@Transactional
public class AdvertiseDaoImpl implements AdvertiseDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate template;

	public void addAdvertise(Advertise advertise) {
		sessionFactory.getCurrentSession().save(advertise);
	}

	public void updateAdvertise(Advertise advertise) {
		sessionFactory.getCurrentSession().saveOrUpdate(advertise);
	}

	public void removeAdvertise(Advertise advertise) {
		sessionFactory.getCurrentSession().delete(advertise);
	}

	public Advertise getAdvertise(int advertiseID) {
		return (Advertise) sessionFactory.getCurrentSession().createQuery(
				"select * from Advertise where id=" + advertiseID);
	}
}
