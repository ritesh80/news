package com.pyr.news.hib.model.acnt;

// Generated Nov 3, 2014 6:22:09 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * EmpDpt generated by hbm2java
 */
@Entity
@Table(name = "emp_dpt", catalog = "demo_news")
public class EmpDpt implements java.io.Serializable {

	private EmpDptId id;
	private Department department;
	private Employee employee;

	public EmpDpt() {
	}

	public EmpDpt(EmpDptId id, Department department, Employee employee) {
		this.id = id;
		this.department = department;
		this.employee = employee;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "empId", column = @Column(name = "emp_id", nullable = false)),
			@AttributeOverride(name = "dptId", column = @Column(name = "dpt_id", nullable = false)) })
	public EmpDptId getId() {
		return this.id;
	}

	public void setId(EmpDptId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dpt_id", nullable = false, insertable = false, updatable = false)
	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "emp_id", nullable = false, insertable = false, updatable = false)
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
