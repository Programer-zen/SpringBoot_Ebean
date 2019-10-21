package com.cheng.model;

import io.ebean.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "email")
public class Mail extends Model implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String mail;

	private Integer user_id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Mail(Integer id, String mail, User user) {
		this.id = id;
		this.mail = mail;
		this.user = user;
	}

	public Mail() {
	}

}
