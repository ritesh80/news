package com.pyr.news.hib.dao.acnt;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.acnt.Employee;
@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

	private SessionFactory sessionFactory;
	public void addEmployee(Employee employee){
		sessionFactory.getCurrentSession().save(employee);
	}
	
	public void updateEmployee(Employee employee){
		sessionFactory.getCurrentSession().saveOrUpdate(employee);
	}
	
	public void removeEmployee(Employee employee){
		sessionFactory.getCurrentSession().delete(employee);
	}
	
	public Employee getEmployee(int emp_id){
		return (Employee)sessionFactory.getCurrentSession().get(Employee.class, emp_id);
	}
}
