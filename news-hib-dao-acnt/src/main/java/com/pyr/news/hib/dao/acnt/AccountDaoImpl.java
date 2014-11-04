package com.pyr.news.hib.dao.acnt;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

//import .hibernate.SessionFactory;
import com.pyr.news.hib.model.acnt.Account;
@Repository("accountDaoImpl")
@Transactional
public class AccountDaoImpl implements AccountDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(account);		
	}

	public void updateAccount(Account account) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(account);
		
	}

	public void removeAccount(Account account) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(account);
		
	}
	
	public Account getAccount(int accountID){
		return (Account)sessionFactory.getCurrentSession().get(Account.class,accountID);
	}
	
	public Account getAccountByLogin(String login){
		return (Account)sessionFactory.getCurrentSession().createSQLQuery("Select * FROM ACCOUNT where login='"+login+"'").uniqueResult();
	}
}
