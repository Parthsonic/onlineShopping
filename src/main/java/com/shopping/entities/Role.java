package com.shopping.entities;

import java.util.Date;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Role  {

	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "seq_role")
	@SequenceGenerator(
			name = "seq_role",
			allocationSize = 1)
	@Column(name = "roleid")
	private Long roleId;
	private String name;
	private String description;
	@Column(name = "createdate")
	private Date createDate;
	@Column(name = "lastmodifieddate")
	private Date lastModifiedDate;
	
	@OneToMany( fetch = FetchType.EAGER)
	@JoinTable(name = "roleactionrel",
		joinColumns = 
	{ @JoinColumn(name = "roleid", referencedColumnName = "roleId") },
	inverseJoinColumns = 
	{ @JoinColumn(name = "actionid", referencedColumnName = "actionId") }
	)
	private List<Action> action;
	
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public List<Action> getAction() {
		return action;
	}
	public void setAction(List<Action> action) {
		this.action = action;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", name=" + name + ", description=" + description + ", createDate="
				+ createDate + ", lastModifiedDate=" + lastModifiedDate + ", action=" + action + "]";
	}
}
