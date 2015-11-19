package com.pyr.news.hib.dao.acnt;

import com.pyr.news.hib.dao.InitDao;
import com.pyr.news.hib.model.acnt.Account;

<<<<<<< HEAD
public interface AccountDao extends InitDao {
=======
public interface AccountDao {


	public void addAccount(Account account);
	
	public void updateAccount(Account account);
	
	public void removeAccount(Account account);
	
	public Account getAccount(int accountID);
	
>>>>>>> 176ab1f0a11b98c026c4c361ce0c4f976e3a934f
	public Account getAccountByLogin(String login);
}
