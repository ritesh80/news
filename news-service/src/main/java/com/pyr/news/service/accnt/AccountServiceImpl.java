package com.pyr.news.service.accnt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pyr.news.hib.dao.acnt.AccountDao;
import com.pyr.news.hib.dao.acnt.DepartmentDao;
import com.pyr.news.hib.dao.acnt.EmployeeDao;
import com.pyr.news.hib.dao.acnt.RoleDao;
import com.pyr.news.hib.dao.acnt.UserDao;
import com.pyr.news.hib.model.acnt.Account;
import com.pyr.news.hib.model.acnt.Department;
import com.pyr.news.hib.model.acnt.Employee;
import com.pyr.news.hib.model.acnt.Role;
import com.pyr.news.hib.model.acnt.User;

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
	private DepartmentDao deptDao;
	
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
	
	public void addUser(User user){
		userDao.addUser(user);
	}
	
	public void updateUser(User user){
		userDao.updateUser(user);
	}
	
	public void removeUser(User user){
		userDao.removeUser(user);
	}
	
	public User getUser(int userID){
		return userDao.getUser(userID);
	}
	
	public void addRole(Role role){
		roleDao.addRole(role);
	}
	
	public void updateRole(Role role){
		roleDao.updateRole(role);
	}
	
	public void removeRole(Role role){
		roleDao.removeRole(role);
	}
	
	public Role getRole(int roleID){
		return roleDao.getRole(roleID);
	}
	
	public void addDepartment(Department department){
		deptDao.addDepartment(department);
	}
	
	public void updateDepartment(Department department){
		deptDao.updateDepartment(department);
	}
	
	public void removeDepartment(Department department){
		deptDao.removeDepartment(department);
	}
	
	public Department getDepartment(int departmentID){
		return deptDao.getDepartment(departmentID);
	}
	
	public void addEmployee(Employee employee){
		empDao.addEmployee(employee);
	}
	
	public void updateEmployee(Employee employee){
		empDao.updateEmployee(employee);
	}
	
	public void removeEmployee(Employee employee){
		empDao.removeEmployee(employee);
	}
	
	public Employee getEmployee(int emp_id){
		return empDao.getEmployee(emp_id);
	}
}
