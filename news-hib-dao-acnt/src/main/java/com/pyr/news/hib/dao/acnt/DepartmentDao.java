package com.pyr.news.hib.dao.acnt;

import com.pyr.news.hib.model.acnt.Department;

public interface DepartmentDao {
	public void addDepartment(Department department);
	
	public void updateDepartment(Department department);
	
	public void removeDepartment(Department department);
	
	public Department getDepartment(int departmentID);
}
