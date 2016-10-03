package io.wzw.backend.data.model;

public class UserRole {
	private Integer idUser;
	private Integer idRole;

	public UserRole(Integer idUser, Integer idRole) {
		this.idUser = idUser;
		this.idRole = idRole;
	}

	public UserRole(){
		
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
