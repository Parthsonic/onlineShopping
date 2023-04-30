package com.shopping.entities;

import java.util.Date;

import jakarta.persistence.Column;
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
	@Column(name = "actionid")
	private Long actionId;
	private String name;
	@Column(name = "createdate")
	private Date createDate;
	@Column(name = "lastmodifieddate")
	private Date lastModifieDdate;
	private String uri;
	
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
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastModifieDdate() {
		return lastModifieDdate;
	}
	public void setLastModifieDdate(Date lastModifieDdate) {
		this.lastModifieDdate = lastModifieDdate;
	}
	
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	@Override
	public String toString() {
		return "Action [actionId=" + actionId + ", name=" + name + ", createDate=" + createDate + ", lastModifieDdate="
				+ lastModifieDdate + ", uri=" + uri + "]";
	}
	
}
