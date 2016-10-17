package io.wzw.backend.data.dao;


import java.util.List;

import io.wzw.backend.data.model.User;
import io.wzw.backend.data.model.UserRole;

public interface UserRoleDAO {

	public UserRole selectByIdAuto(Integer id);
	
	public UserRole selectByIdUser(Integer id);
	
	public UserRole selectByIdRole(Integer id);
	
	public List<UserRole> selectAll();

	public void insert(UserRole userRole);

	public void update(UserRole userRole);

	public void delete(UserRole userRole);
}
