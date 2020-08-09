package com.its.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "account", schema = "business_demo", catalog = "")
public class AccountEntity {
	private int id;
	private String account;
	private String password;
	private String username;
	private String email;

	@Id
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "account")
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	@Basic
	@Column(name = "password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Basic
	@Column(name = "username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Basic
	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		AccountEntity that = (AccountEntity) o;
		return id == that.id &&
				Objects.equals(account, that.account) &&
				Objects.equals(password, that.password) &&
				Objects.equals(username, that.username) &&
				Objects.equals(email, that.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, account, password, username, email);
	}
}
