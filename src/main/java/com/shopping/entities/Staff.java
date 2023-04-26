package com.shopping.entities;

import java.util.Date;

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
	private Long staffId;
	private String name;
	private String password;
	private Date createdate;
	private Date lastmodifieddate;
	
	@OneToOne
	@JoinColumn(name = "roleid", referencedColumnName = "roleid")
	private Role role;
	
	
	public Long getStaffId() {
		return staffId;
	}
	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Staff [staffId=" + staffId + ", name=" + name + ", password=" + password + ", createdate=" + createdate
				+ ", lastmodifieddate=" + lastmodifieddate + ", role=" + role + "]";
	}
	
}
