package io.wzw.backend.data.dao;

import java.util.List;
import io.wzw.backend.data.model.Role;

/**
 * @author Mikel
 *
 */
public interface RoleDAO {
	
	public Role selectById(Long id);

	public List<Role> selectAll();

	public void insert(Role role);

	public void update(Role role);

	public void delete(Role role);
	
}
