package io.wzw.backend.data.model;

import java.io.Serializable;

public class Avatar implements Serializable{
	private Long id;
	private String description;
	private String image;
	private User user;
	

	public Avatar() { }
	
	/**
	 * @param id
	 * @param description
	 * @param image
	 */
	public Avatar(Long id, String description, String image, User user) {
		this.id = id;
		this.description = description;
		this.image = image;
		this.user = user;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
