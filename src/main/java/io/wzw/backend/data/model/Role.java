package io.wzw.backend.data.model;

public class Role {
	private Long id;
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
	public Role(Long id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	/**
	 * 
	 * @return id
	 * 			
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id
	 * 			the id to set
	 */
	public void setId(Long id) {
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
