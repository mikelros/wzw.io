package io.wzw.backend.data.model;

import java.io.Serializable;

public class Role implements Serializable{
	private Integer id;
	private String name;
	private String description;
	
	public Role(){
		
	}
	
	/**
	 * Constructor with all attributes
	 * 
	 * @param id
	 * @param name
	 * @param description
	 */
	public Role(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	/**
	 * 
	 * @return id
	 * 			
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id
	 * 			the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 * 				the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 * 					the email to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
