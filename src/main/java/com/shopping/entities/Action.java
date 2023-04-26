package com.shopping.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Action {
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "seq_action")
	@SequenceGenerator(
			name = "seq_action",
			allocationSize = 1)
	private Long actionId;
	private String name;
	private Date createdate;
	private Date lastmodifieddate;
	
	public Long getActionId() {
		return actionId;
	}
	public void setActionId(Long actionId) {
		this.actionId = actionId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public Date getLastmodifieddate() {
		return lastmodifieddate;
	}
	public void setLastmodifieddate(Date lastmodifieddate) {
		this.lastmodifieddate = lastmodifieddate;
	}
	@Override
	public String toString() {
		return "Action [actionId=" + actionId + ", name=" + name + ", createdate=" + createdate + ", lastmodifieddate="
				+ lastmodifieddate + "]";
	}
	
	
}
