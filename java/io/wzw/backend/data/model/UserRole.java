package io.wzw.backend.data.model;

public class UserRole {
	private Integer autoId;
	private Integer idUser;
	private Integer idRole;

	public UserRole(Integer autoId, Integer idUser, Integer idRole) {
		this.autoId = autoId;
		this.idUser = idUser;
		this.idRole = idRole;
	}

	public UserRole(){
		
	}
	
	public Integer getAutoId() {
		return autoId;
	}

	public void setAutoID(Integer autoId) {
		this.autoId = autoId;
	}
	
	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	public Integer getIdRole() {
		return idRole;
	}

	public void setIdRole(Integer idRole) {
		this.idRole = idRole;
	}

	
}
