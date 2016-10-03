package io.wzw.backend.data.dao;

import java.util.List;
import io.wzw.backend.data.model.Role;

/**
 * @author David
 *
 */
public interface RoleDAO {
	
	public Role selectById(Integer id);

	public List<Role> selectAll();

	public void insert(Role role);

	public void update(Role role);

	public void delete(Role role);
	
}
