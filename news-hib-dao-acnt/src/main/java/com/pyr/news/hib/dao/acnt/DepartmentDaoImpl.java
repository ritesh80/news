package com.pyr.news.hib.dao.acnt;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.acnt.Department;

@Repository
@Transactional
public class DepartmentDaoImpl implements DepartmentDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addDepartment(Department department){
		sessionFactory.getCurrentSession().save(department);
	}
	
	public void updateDepartment(Department department){
		sessionFactory.getCurrentSession().saveOrUpdate(department);
	}
	
	public void removeDepartment(Department department){
		sessionFactory.getCurrentSession().delete(department);
	}
	
	public Department getDepartment(int departmentID){
		return (Department)sessionFactory.getCurrentSession().get(Department.class, departmentID);
	}
	
}
