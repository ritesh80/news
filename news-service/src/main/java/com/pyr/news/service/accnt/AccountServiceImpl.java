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

	// @Autowired
	private AccountDao accountDaoImpl;

	// @Autowired
	private UserDao userDaoImpl;

	// @Autowired
	private EmployeeDao empDaoImpl;

	// @Autowired
	private RoleDao roleDaoImpl;

	// @Autowired
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

	public void addAccount(Account account) {
		accountDaoImpl.insert(account);
	}

	public void updateAccount(Account account) {
		accountDaoImpl.update(account);
	}

	public void removeAccount(Account account) {
		accountDaoImpl.remove(account);
	}

	public Account getAccount(int accountID) {
		return (Account) accountDaoImpl.get(Account.class, accountID);
	}

	public Account getAccountByLogin(String login) {
		return accountDaoImpl.getAccountByLogin(login);
	}

	public void addUser(User user) {
		userDaoImpl.insert(user);
	}

	public void updateUser(User user) {
		userDaoImpl.update(user);
	}

	public void removeUser(User user) {
		userDaoImpl.remove(user);
	}

	public User getUser(int userID) {
		return (User) userDaoImpl.get(User.class, userID);
	}

	public void addRole(Role role) {
		roleDaoImpl.insert(role);
	}

	public void updateRole(Role role) {
		roleDaoImpl.update(role);
	}

	public void removeRole(Role role) {
		roleDaoImpl.remove(role);
	}

	public Role getRole(int roleID) {
		return (Role) roleDaoImpl.get(Role.class, roleID);
	}

	public void addDepartment(Department department) {
		deptDaoImpl.insert(department);
	}

	public void updateDepartment(Department department) {
		deptDaoImpl.update(department);
	}

	public void removeDepartment(Department department) {
		deptDaoImpl.remove(department);
	}

	public Department getDepartment(int departmentID) {
		return (Department) deptDaoImpl.get(Department.class, departmentID);
	}

	public void addEmployee(Employee employee) {
		empDaoImpl.insert(employee);
	}

	public void updateEmployee(Employee employee) {
		empDaoImpl.update(employee);
	}

	public void removeEmployee(Employee employee) {
		empDaoImpl.remove(employee);
	}

	public Employee getEmployee(int emp_id) {
		return (Employee) empDaoImpl.get(Employee.class, emp_id);
	}
}
