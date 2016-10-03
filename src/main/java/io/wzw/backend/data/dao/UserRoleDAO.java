package io.wzw.backend.data.dao;


import io.wzw.backend.data.model.UserRole;

public interface UserRoleDAO {

	public UserRole selectByAutoId(Long id);
	
	public UserRole selectByIdUser(Long id);
	
	public UserRole selectByIdRole(Long id);
}
