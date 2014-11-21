package com.pyr.news.hib.model.scheduler;

// Generated Nov 3, 2014 6:39:36 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BgProcess generated by hbm2java
 */
@Entity
@Table(name = "bg_process", catalog = "demo_news")
public class BgProcess implements java.io.Serializable {

	private int id;
	private BgProcessInput bgProcessInput;
	private BgProcessType bgProcessType;
	private String description;
	private String status;
	private String comment;
	private Date createdDate;
	private int createdBy;
	private Set<Scheduler> schedulers = new HashSet(0);

	public BgProcess() {
	}

	public BgProcess(int id, BgProcessType bgProcessType, String status,
			Date createdDate, int createdBy) {
		this.id = id;
		this.bgProcessType = bgProcessType;
		this.status = status;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
	}

	public BgProcess(int id, BgProcessInput bgProcessInput,
			BgProcessType bgProcessType, String description, String status,
			String comment, Date createdDate, int createdBy, Set<Scheduler> schedulers) {
		this.id = id;
		this.bgProcessInput = bgProcessInput;
		this.bgProcessType = bgProcessType;
		this.description = description;
		this.status = status;
		this.comment = comment;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.schedulers = schedulers;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "input")
	public BgProcessInput getBgProcessInput() {
		return this.bgProcessInput;
	}

	public void setBgProcessInput(BgProcessInput bgProcessInput) {
		this.bgProcessInput = bgProcessInput;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "type", nullable = false)
	public BgProcessType getBgProcessType() {
		return this.bgProcessType;
	}

	public void setBgProcessType(BgProcessType bgProcessType) {
		this.bgProcessType = bgProcessType;
	}

	@Column(name = "description", length = 1000)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "status", nullable = false, length = 34)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "comment", length = 1000)
	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_date", nullable = false, length = 19)
	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@Column(name = "createdBy", nullable = false)
	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "bg_process_scheduler", catalog = "demo_news", joinColumns = { @JoinColumn(name = "bg_process_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "scheduler_id", nullable = false, updatable = false) })
	public Set<Scheduler> getSchedulers() {
		return this.schedulers;
	}

	public void setSchedulers(Set<Scheduler> schedulers) {
		this.schedulers = schedulers;
	}

}
