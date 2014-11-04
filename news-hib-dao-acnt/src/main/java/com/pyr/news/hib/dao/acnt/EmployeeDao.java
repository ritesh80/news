package com.pyr.news.hib.dao.acnt;

import com.pyr.news.hib.model.acnt.Employee;

public interface EmployeeDao {
	public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public void removeEmployee(Employee employee);
	
	public Employee getEmployee(int emp_id);
}
