package com.pyr.news.hib.model.acnt;

// Generated Nov 3, 2014 6:22:09 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Department generated by hbm2java
 */
@Entity
@Table(name = "department", catalog = "demo_news")
public class Department implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set<EmpDpt> empDpts = new HashSet(0);

	public Department() {
	}

	public Department(String name) {
		this.name = name;
	}

	public Department(String name, Set<EmpDpt> empDpts) {
		this.name = name;
		this.empDpts = empDpts;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<EmpDpt> getEmpDpts() {
		return this.empDpts;
	}

	public void setEmpDpts(Set<EmpDpt> empDpts) {
		this.empDpts = empDpts;
	}

}
