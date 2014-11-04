package com.pyr.news.hib.dao.acnt;

import com.pyr.news.hib.model.acnt.*;

public interface AccountDao {

	public void addAccount(Account account);
	
	public void updateAccount(Account account);
	
	public void removeAccount(Account account);
	
	public Account getAccount(int accountID);
	
	public Account getAccountByLogin(String login);
}
