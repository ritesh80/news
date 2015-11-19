package com.pyr.news.hib.dao.acnt;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.dao.CustomDaoSupport;
//import .hibernate.SessionFactory;
import com.pyr.news.hib.model.acnt.Account;

@Repository
@Transactional
public class AccountDaoImpl extends CustomDaoSupport implements AccountDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Account getAccountByLogin(String login) {
		return (Account) getHibernateTemplate()
				.getSessionFactory()
				.getCurrentSession()
				.createSQLQuery(
						"Select * FROM ACCOUNT where login='" + login + "'")
				.uniqueResult();
	}
	/*
	 * select * from ACCOUNT where id=x; select count(*) from ACCOUNT; select *
	 * from ACCOUNT limit initial , page; select * from ACCOUNT ac join
	 * USER_ACCOUNT us_ac on (ac.id = us_ac.user_id) where status in ('Active');
	 */

}
