package com.programmingfree.springservice;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="priority")
public class Priority {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="priority_id")
	private int id;
	
	@Column(name="priority_name")
	private String priorityName;
	
	@Column(name="priority_active")
	private String priorityActive;
	
	@Column(name="priority_created_at")
	private Date priorityCreatedAt;
	
	@Column(name="priority_updated_at")
	private Date priorityUpdatedAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPriorityName() {
		return priorityName;
	}

	public void setPriorityName(String priorityName) {
		this.priorityName = priorityName;
	}

	public String getPriorityActive() {
		return priorityActive;
	}

	public void setPriorityActive(String priorityActive) {
		this.priorityActive = priorityActive;
	}

	public Date getPriorityCreatedAt() {
		return priorityCreatedAt;
	}

	public void setPriorityCreatedAt(Date priorityCreatedAt) {
		this.priorityCreatedAt = priorityCreatedAt;
	}

	public Date getPriorityUpdatedAt() {
		return priorityUpdatedAt;
	}

	public void setPriorityUpdatedAt(Date priorityUpdatedAt) {
		this.priorityUpdatedAt = priorityUpdatedAt;
	}
}
