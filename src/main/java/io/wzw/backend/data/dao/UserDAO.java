package io.wzw.backend.data.dao;

import java.util.List;
import io.wzw.backend.data.model.User;

/**
 * @author Mikel
 *
 */
public interface UserDAO {
	
	public User selectById(Integer id);

	public List<User> selectAll();

	public void insert(User user);

	public void update(User user);

	public void delete(User user);
	
}
