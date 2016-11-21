/**
 * 
 */
package io.wzw.backend.data.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 */
public class Message implements Serializable {
	
	private Long id;
	private String content;
	private Date messageDate;
	private User user;
	private ChatGroup chatGroup;
	
	public Message () {
		
	}

	/**
	 * @param id
	 * @param content
	 * @param messageDate
	 * @param user
	 * @param chatGroup
	 */
	public Message(Long id, String content, Date messageDate, User user, ChatGroup chatGroup) {
		this.id = id;
		this.content = content;
		this.messageDate = messageDate;
		this.user = user;
		this.chatGroup = chatGroup;
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
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the messageDate
	 */
	public Date getMessageDate() {
		return messageDate;
	}

	/**
	 * @param messageDate the messageDate to set
	 */
	public void setMessageDate(Date messageDate) {
		this.messageDate = messageDate;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the chatGroup
	 */
	public ChatGroup getChatGroup() {
		return chatGroup;
	}

	/**
	 * @param chatGroup the chatGroup to set
	 */
	public void setChatGroup(ChatGroup chatGroup) {
		this.chatGroup = chatGroup;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Message [id=" + id + ", content=" + content + ", messageDate=" + messageDate + ", user=" + user
				+ ", chatGroup=" + chatGroup + "]";
	}
	
	

}
