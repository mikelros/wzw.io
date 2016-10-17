package io.wzw.backend.data.model;

import java.io.Serializable;
import java.util.List;

/**
 * Represents the user data
 * @author Mikel
 *
 */
public class User implements Serializable{
	private Integer id;
	private String username;
	private String password;
	private String email;
	private Avatar avatar;
	private List<Meetup> meetups;

	public User() {
	}
	
	public User(Integer id, String username, String password, String email, Avatar avatar, List<Meetup> meetups) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.meetups = meetups;
		this.avatar = avatar;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Meetup> getMeetups() {
		return meetups;
	}

	public void setMeetups(List<Meetup> meetups) {
		this.meetups = meetups;
	}
	
	public Avatar getAvatar() {
		return avatar;
	}

	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}
}
