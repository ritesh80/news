package com.pyr.news.hib.model.scheduler;

// Generated Nov 3, 2014 6:39:36 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Scheduler generated by hbm2java
 */
@Entity
@Table(name = "scheduler", catalog = "demo_news")
public class Scheduler implements java.io.Serializable {

	private Integer id;
	private String name;
	private Date startDate;
	private Date endDate;
	private String type;
	private String priority;
	private Date triggerTime;
	private Set<AccountScheduler> accountSchedulers = new HashSet(0);
	private Set<BgProcess> bgProcesses = new HashSet(0);

	public Scheduler() {
	}

	public Scheduler(String name, String priority, Date triggerTime) {
		this.name = name;
		this.priority = priority;
		this.triggerTime = triggerTime;
	}

	public Scheduler(String name, Date startDate, Date endDate, String type,
			String priority, Date triggerTime, Set<AccountScheduler> accountSchedulers,
			Set<BgProcess> bgProcesses) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.type = type;
		this.priority = priority;
		this.triggerTime = triggerTime;
		this.accountSchedulers = accountSchedulers;
		this.bgProcesses = bgProcesses;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "start_date", length = 19)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "end_date", length = 19)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Column(name = "type", length = 20)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "priority", nullable = false, length = 16)
	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "trigger_time", nullable = false, length = 19)
	public Date getTriggerTime() {
		return this.triggerTime;
	}

	public void setTriggerTime(Date triggerTime) {
		this.triggerTime = triggerTime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "scheduler")
	public Set<AccountScheduler> getAccountSchedulers() {
		return this.accountSchedulers;
	}

	public void setAccountSchedulers(Set<AccountScheduler> accountSchedulers) {
		this.accountSchedulers = accountSchedulers;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "bg_process_scheduler", catalog = "demo_news", joinColumns = { @JoinColumn(name = "scheduler_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "bg_process_id", nullable = false, updatable = false) })
	public Set<BgProcess> getBgProcesses() {
		return this.bgProcesses;
	}

	public void setBgProcesses(Set<BgProcess> bgProcesses) {
		this.bgProcesses = bgProcesses;
	}

}
