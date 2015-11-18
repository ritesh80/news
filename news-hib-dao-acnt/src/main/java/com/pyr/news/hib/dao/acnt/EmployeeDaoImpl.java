package com.pyr.news.hib.dao.acnt;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.acnt.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Autowired
	private HibernateTemplate template;

	public void addEmployee(Employee employee) {
		template.save(employee);
	}

	public void updateEmployee(Employee employee) {
		template.saveOrUpdate(employee);
	}

	public void removeEmployee(Employee employee) {
		template.delete(employee);
	}

	public Employee getEmployee(int emp_id) {
		return (Employee) template.get(Employee.class, emp_id);
	}
}
