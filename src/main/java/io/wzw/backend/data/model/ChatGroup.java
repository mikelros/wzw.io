package io.wzw.backend.data.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class ChatGroup implements Serializable {
	private Long id;
	private String name;
	private String description;
	private Set<Message> messages = new HashSet<Message>();
	private Set<User> users = new HashSet<User>();
	
	/**
	 * 
	 */
	public ChatGroup() {
	}
	
	
	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param messages
	 * @param users
	 */
	public ChatGroup(Long id, String name, String description, Set<Message> messages, Set<User> users) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.messages = messages;
		this.users = users;
	}


	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the messages
	 */
	public Set<Message> getMessages() {
		return messages;
	}


	/**
	 * @param messages the messages to set
	 */
	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}


	/**
	 * @return the users
	 */
	public Set<User> getUsers() {
		return users;
	}


	/**
	 * @param users the users to set
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ChatGroup [id=" + id + ", name=" + name + ", description=" + description + ", messages=" + messages
				+ ", users=" + users + "]";
	}

	

}
