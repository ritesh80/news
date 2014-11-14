package com.pyr.news.service.accnt;

import com.pyr.news.hib.model.acnt.Account;
import com.pyr.news.hib.model.acnt.Department;
import com.pyr.news.hib.model.acnt.Employee;
import com.pyr.news.hib.model.acnt.Role;
import com.pyr.news.hib.model.acnt.User;

public interface AccountService {

	public void addAccount(Account account);
	
	public void updateAccount(Account account);
	
	public void removeAccount(Account account);
	
	public Account getAccount(int accountID);
	
	public Account getAccountByLogin(String login);
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void removeUser(User user);
	
	public User getUser(int userID);
	
	public void addRole(Role role);
	
	public void updateRole(Role role);
	
	public void removeRole(Role role);
	
	public Role getRole(int roleID);
	
	public void addDepartment(Department department);
	
	public void updateDepartment(Department department);
	
	public void removeDepartment(Department department);
	
	public Department getDepartment(int departmentID);
	
	public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public void removeEmployee(Employee employee);
	
	public Employee getEmployee(int emp_id);
}
