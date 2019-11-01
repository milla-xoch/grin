package com.grin.logscooter.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table( name = "user" )
@Data
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6382326367169032078L;

	@Column(name="user_id")
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Integer userId;
	@Column(name="user_name")
	private String userName;
	private String password;
	private String email;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
