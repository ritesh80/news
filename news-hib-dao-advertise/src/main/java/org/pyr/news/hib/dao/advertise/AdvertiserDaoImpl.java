package org.pyr.news.hib.dao.advertise;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.dao.CustomDaoSupport;

@Repository
@Transactional
public class AdvertiserDaoImpl extends CustomDaoSupport implements
		AdvertiserDao {

	@Autowired
	private SessionFactory sessionFactory;

}
