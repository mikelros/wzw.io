package io.wzw.backend.data.model;

import java.io.Serializable;

public class UserRole implements Serializable{
	private Integer idAuto;
	private Integer idUser;
	private Integer idRole;

	public UserRole(Integer idAuto, Integer idUser, Integer idRole) {
		this.idAuto = idAuto;
		this.idUser = idUser;
		this.idRole = idRole;
	}

	public UserRole(){
		
	}
	
	public Integer getIdAuto() {
		return idAuto;
	}

	public void setAutoID(Integer idAuto) {
		this.idAuto = idAuto;
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
