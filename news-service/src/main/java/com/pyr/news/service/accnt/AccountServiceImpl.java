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
	
	//@Autowired
	private AccountDao accountDaoImpl;
	
	//@Autowired
	private UserDao userDaoImpl;
	
	//@Autowired
	private EmployeeDao empDaoImpl;
	
	//@Autowired
	private RoleDao roleDaoImpl;
	
	//@Autowired
	private DepartmentDao deptDaoImpl;
	@Autowired
	public AccountDao getAccountDaoImpl() {
		return accountDaoImpl;
	}
	
	public void setAccountDaoImpl(AccountDao accountDaoImpl) {
		this.accountDaoImpl = accountDaoImpl;
	}
	@Autowired
	public UserDao getUserDaoImpl() {
		return userDaoImpl;
	}

	public void setUserDaoImpl(UserDao userDaoImpl) {
		this.userDaoImpl = userDaoImpl;
	}
	@Autowired
	public EmployeeDao getEmpDaoImpl() {
		return empDaoImpl;
	}

	public void setEmpDaoImpl(EmployeeDao empDaoImpl) {
		this.empDaoImpl = empDaoImpl;
	}
	@Autowired
	public RoleDao getRoleDaoImpl() {
		return roleDaoImpl;
	}

	public void setRoleDaoImpl(RoleDao roleDaoImpl) {
		this.roleDaoImpl = roleDaoImpl;
	}
	@Autowired
	public DepartmentDao getDeptDaoImpl() {
		return deptDaoImpl;
	}

	public void setDeptDaoImpl(DepartmentDao deptDaoImpl) {
		this.deptDaoImpl = deptDaoImpl;
	}

	public void addAccount(Account account){
		accountDaoImpl.addAccount(account);
	}
	
	public void updateAccount(Account account){
		accountDaoImpl.updateAccount(account);
	}
	
	public void removeAccount(Account account){
		accountDaoImpl.removeAccount(account);
	}
	
	public Account getAccount(int accountID){
		return accountDaoImpl.getAccount(accountID);
	}
	
	public Account getAccountByLogin(String login){
		return accountDaoImpl.getAccountByLogin(login);
	}
	
	public void addUser(User user){
		userDaoImpl.addUser(user);
	}
	
	public void updateUser(User user){
		userDaoImpl.updateUser(user);
	}
	
	public void removeUser(User user){
		userDaoImpl.removeUser(user);
	}
	
	public User getUser(int userID){
		return userDaoImpl.getUser(userID);
	}
	
	public void addRole(Role role){
		roleDaoImpl.addRole(role);
	}
	
	public void updateRole(Role role){
		roleDaoImpl.updateRole(role);
	}
	
	public void removeRole(Role role){
		roleDaoImpl.removeRole(role);
	}
	
	public Role getRole(int roleID){
		return roleDaoImpl.getRole(roleID);
	}
	
	public void addDepartment(Department department){
		deptDaoImpl.addDepartment(department);
	}
	
	public void updateDepartment(Department department){
		deptDaoImpl.updateDepartment(department);
	}
	
	public void removeDepartment(Department department){
		deptDaoImpl.removeDepartment(department);
	}
	
	public Department getDepartment(int departmentID){
		return deptDaoImpl.getDepartment(departmentID);
	}
	
	public void addEmployee(Employee employee){
		empDaoImpl.addEmployee(employee);
	}
	
	public void updateEmployee(Employee employee){
		empDaoImpl.updateEmployee(employee);
	}
	
	public void removeEmployee(Employee employee){
		empDaoImpl.removeEmployee(employee);
	}
	
	public Employee getEmployee(int emp_id){
		return empDaoImpl.getEmployee(emp_id);
	}
}
