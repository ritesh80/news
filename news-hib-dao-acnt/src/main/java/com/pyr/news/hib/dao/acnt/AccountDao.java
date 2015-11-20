package com.pyr.news.hib.dao.acnt;

import com.pyr.news.hib.dao.InitDao;
import com.pyr.news.hib.model.acnt.Account;

public interface AccountDao extends InitDao {

	public Account getAccountByLogin(String login);
}
