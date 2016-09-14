package com.programmingfree.springservice;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="state")
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="state_id")
	private int id;

	@Column(name="state_name")
	private String stateName;
	
	@Column(name="state_active")
	private String stateActive;
	
	@Column(name="state_created_at")
	private Date stateCreatedAt;
	
	@Column(name="state_updated_at")
	private Date stateUpdatedAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getstateName() {
		return stateName;
	}

	public void setstateName(String stateName) {
		this.stateName = stateName;
	}

	public String getStateActive() {
		return stateActive;
	}

	public void setStateActive(String stateActive) {
		this.stateActive = stateActive;
	}

	public Date getstateCreatedAt() {
		return stateCreatedAt;
	}

	public void setstateCreatedAt(Date stateCreatedAt) {
		this.stateCreatedAt = stateCreatedAt;
	}

	public Date getstateUpdatedAt() {
		return stateUpdatedAt;
	}

	public void setstateUpdatedAt(Date stateUpdatedAt) {
		this.stateUpdatedAt = stateUpdatedAt;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "State [id=" + id + ", stateName=" + stateName
				+ "]";
	}
	
}
