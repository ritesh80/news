package org.pyr.news.service.accnt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pyr.news.hib.dao.acnt.AccountDao;
import com.pyr.news.hib.dao.acnt.DepartmentDao;
import com.pyr.news.hib.dao.acnt.EmployeeDao;
import com.pyr.news.hib.dao.acnt.RoleDao;
import com.pyr.news.hib.dao.acnt.UserDao;
import com.pyr.news.hib.model.acnt.Account;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountDao accountDao;
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private EmployeeDao empDao;
	
	@Autowired
	private RoleDao roleDao;
	
	@Autowired
	private DepartmentDao DeptDao;
	
	public void addAccount(Account account){
		accountDao.addAccount(account);
	}
	
	public void updateAccount(Account account){
		accountDao.updateAccount(account);
	}
	
	public void removeAccount(Account account){
		accountDao.removeAccount(account);
	}
	
	public Account getAccount(int accountID){
		return accountDao.getAccount(accountID);
	}
	
	public Account getAccountByLogin(String login){
		return accountDao.getAccountByLogin(login);
	}
}
