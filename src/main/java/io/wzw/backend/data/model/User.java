package io.wzw.backend.data.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Represents the user data
 * @author Mikel
 *
 */
public class User implements Serializable{
	private Long id;
	private String username;
	private String password;
	private String email;
	private Avatar avatar;
	private Set<Role> roles;
	private List<Meetup> meetups;

	public User() {
		roles = new HashSet<Role>();
	}

	public User(Long id, String username, String password, String email, Avatar avatar, Set<Role> roles,
			List<Meetup> meetups) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.avatar = avatar;
		this.roles = roles;
		this.meetups = meetups;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Avatar getAvatar() {
		return avatar;
	}

	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public List<Meetup> getMeetups() {
		return meetups;
	}

	public void setMeetups(List<Meetup> meetups) {
		this.meetups = meetups;
	}
	
	
	
}
