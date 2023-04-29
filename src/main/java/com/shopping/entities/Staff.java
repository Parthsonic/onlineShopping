package com.shopping.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Staff {
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "seq_staff"
			)
	@SequenceGenerator(name = "seq_staff",
			allocationSize = 1)
	@Column(name = "staffid")
	private Long staffId;
	@Column(unique = true)
	private String username;
	private String password;
	@Column(name = "createdate")
	private Date createDate;
	@Column(name = "lastmodifieddate")
	private Date lastModifiedDate;
	
	@OneToOne
	@JoinColumn(name = "roleid", referencedColumnName = "roleid")
	private Role role;
	
	
	public Long getStaffId() {
		return staffId;
	}
	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", name=" + username + ", password=" + password + ", createDate=" + createDate
				+ ", lastModifiedDate=" + lastModifiedDate + ", role=" + role + "]";
	}
}
