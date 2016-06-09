package com.cohifi.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "user")
@XmlType(propOrder = { "u_id", "username", "firstname", "lastname", "email", "address1","password" })
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3723910394542506471L;

	private int u_id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String email;
	private String address1;

	public User(int u_id, String username, String firstname, String lastname, String email, String address1,
			String password) {
		this.u_id = u_id;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.address1 = address1;
		this.password = password;
	}

	public User() {
		// default constructor
	}

	public int getU_id() {
		return u_id;
	}

	public String getUsername() {
		return username;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress1() {
		return address1;
	}

	public String getPassword() {
		return password;
	}

	@XmlElement(name = "u_id")
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	@XmlElement(name = "username")
	public void setUsername(String username) {
		this.username = username;
	}

	@XmlElement(name = "firstname")
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@XmlElement(name = "lastname")
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@XmlElement(name = "email")
	public void setEmail(String email) {
		this.email = email;
	}

	@XmlElement(name = "address1")
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@XmlElement(name = "password")
	public void setPassword(String password) {
		this.password = password;
	}

}
