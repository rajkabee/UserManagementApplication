package com.hospital.userManagement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int role_id;
	@Value("user")
	private String role_Name;
	
	public Role() {
	}

	public Role(int role_id, String role_Name) {
		super();
		this.role_id = role_id;
		this.role_Name = role_Name;
	}
	
	
	
	public Role(String role_Name) {
		super();
		this.role_Name = role_Name;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole_Name() {
		return role_Name;
	}

	public void setRole_Name(String role_Name) {
		this.role_Name = role_Name;
	}

	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", role_Name=" + role_Name + "]";
	}
	
	
}
