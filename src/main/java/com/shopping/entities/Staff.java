package com.shopping.entities;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Staff implements UserDetails{
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
	
	@ManyToMany( fetch = FetchType.EAGER)
	@JoinTable(
			name = "staffrolrel",
			joinColumns =  @JoinColumn(name = "staffid", referencedColumnName = "staffId"),
			inverseJoinColumns = @JoinColumn(name = "roleid", referencedColumnName = "roleId")
			)
	private Set<Role> role;
	
	
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
	
	public Set<Role> getRole() {
		return role;
	}
	public void setRole(Set<Role> role) {
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
		return "Staff [staffId=" + staffId + ", username=" + username + ", password=" + password + ", createDate="
				+ createDate + ", lastModifiedDate=" + lastModifiedDate + "]";
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		List<SimpleGrantedAuthority> authorities = role.stream().map((role)-> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
		System.out.println("Authorities in staff entitty : "+ authorities);
		return authorities;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}
