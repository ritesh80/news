package com.pyr.news.hib.dao.acnt;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//import .hibernate.SessionFactory;
import com.pyr.news.hib.model.acnt.Account;

@Repository
@Transactional
public class AccountDaoImpl implements AccountDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate template;

	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		template.save(account);
	}

	public void updateAccount(Account account) {
		// TODO Auto-generated method stub
		template.saveOrUpdate(account);

	}

	public void removeAccount(Account account) {
		// TODO Auto-generated method stub
		template.delete(account);

	}

	public Account getAccount(int accountID) {
		return (Account) template.get(Account.class, accountID);
	}

	public Account getAccountByLogin(String login) {
		return (Account) template
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
