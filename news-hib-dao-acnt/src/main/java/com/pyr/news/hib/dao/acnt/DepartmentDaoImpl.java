package com.pyr.news.hib.dao.acnt;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pyr.news.hib.model.acnt.Department;

@Repository
@Transactional
public class DepartmentDaoImpl implements DepartmentDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate template;

	public void addDepartment(Department department) {
		template.save(department);
	}

	public void updateDepartment(Department department) {
		template.saveOrUpdate(department);
	}

	public void removeDepartment(Department department) {
		template.delete(department);
	}

	public Department getDepartment(int departmentID) {
		return (Department) template.get(Department.class, departmentID);
	}

}
