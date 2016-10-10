package io.wzw.backend.data.dao;


import io.wzw.backend.data.model.UserRole;

public interface UserRoleDAO {

	public UserRole selectByIdAuto(Integer id);
	
	public UserRole selectByIdUser(Integer id);
	
	public UserRole selectByIdRole(Integer id);
}
