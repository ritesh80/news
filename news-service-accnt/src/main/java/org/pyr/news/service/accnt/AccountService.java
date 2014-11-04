package org.pyr.news.service.accnt;

import com.pyr.news.hib.model.acnt.Account;

public interface AccountService {

	public void addAccount(Account account);
	
	public void updateAccount(Account account);
	
	public void removeAccount(Account account);
	
	public Account getAccount(int accountID);
	
	public Account getAccountByLogin(String login);
}
