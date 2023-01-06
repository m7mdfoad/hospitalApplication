package com.m7md.hospitalManager.beans;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User implements Serializable {

	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */

	@Id
	@Column(nullable = false, updatable = false, unique = true)
	int id;
	@Column(nullable = false, updatable = true)
	String name;
	@Column(nullable = false, updatable = true)
	Date birthday;
	@Column(nullable = false, updatable = true)
	String gender;
	@Column(nullable = false, updatable = true)
	String username;
	@Column(nullable = false, updatable = true)
	String password;
	@Column(nullable = false, updatable = true)
	String type;
	@Column(nullable = false, updatable = true)
	String userCode;

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public User() {
		super();
	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public User(String username) {
		super();
		this.username = username;
	}

	public User(int id, String name, Date birthday, String gender, String username, String password, String type) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.username = username;
		this.password = password;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + ", birthday=" + birthday + ", gender=" + gender + ", username="
				+ username + ", password=" + password + ", type=" + type + "]";
	}

}
