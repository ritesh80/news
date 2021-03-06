package com.pyr.news.hib.model.acnt;

// Generated Nov 3, 2014 6:22:09 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EmpDptId generated by hbm2java
 */
@Embeddable
public class EmpDptId implements java.io.Serializable {

	private int empId;
	private int dptId;

	public EmpDptId() {
	}

	public EmpDptId(int empId, int dptId) {
		this.empId = empId;
		this.dptId = dptId;
	}

	@Column(name = "emp_id", nullable = false)
	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Column(name = "dpt_id", nullable = false)
	public int getDptId() {
		return this.dptId;
	}

	public void setDptId(int dptId) {
		this.dptId = dptId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EmpDptId))
			return false;
		EmpDptId castOther = (EmpDptId) other;

		return (this.getEmpId() == castOther.getEmpId())
				&& (this.getDptId() == castOther.getDptId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEmpId();
		result = 37 * result + this.getDptId();
		return result;
	}

}
