package com.pyr.news.hib.model.acnt;

// Generated Nov 3, 2014 6:22:09 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EmpRolesId generated by hbm2java
 */
@Embeddable
public class EmpRolesId implements java.io.Serializable {

	private int empId;
	private int roleId;

	public EmpRolesId() {
	}

	public EmpRolesId(int empId, int roleId) {
		this.empId = empId;
		this.roleId = roleId;
	}

	@Column(name = "emp_id", nullable = false)
	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Column(name = "role_id", nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EmpRolesId))
			return false;
		EmpRolesId castOther = (EmpRolesId) other;

		return (this.getEmpId() == castOther.getEmpId())
				&& (this.getRoleId() == castOther.getRoleId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEmpId();
		result = 37 * result + this.getRoleId();
		return result;
	}

}
