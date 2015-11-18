package org.pyr.news.hib.dao.advertise;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.advertise.Advertiser;

@Repository
@Transactional
public class AdvertiserDaoImpl implements AdvertiserDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate template;

	public void addAdvertiser(Advertiser advertiser) {
		sessionFactory.getCurrentSession().save(advertiser);
	}

	public void updateAdvertiser(Advertiser advertiser) {
		sessionFactory.getCurrentSession().saveOrUpdate(advertiser);
	}

	public void removeAdvertiser(Advertiser advertiser) {
		sessionFactory.getCurrentSession().delete(advertiser);
	}

	public Advertiser getAdvertiser(int advertiserID) {
		return (Advertiser) sessionFactory.getCurrentSession().createSQLQuery(
				"select * from Advertiser where id =" + advertiserID);
	}
}
