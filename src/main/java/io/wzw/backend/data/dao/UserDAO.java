package io.wzw.backend.data.dao;

import org.hibernate.HibernateException;

import io.wzw.backend.data.model.User;

/**
 * @author Mikel
 *
 */
public interface UserDAO extends GenericDAO<User> {
	public User existingUser(String username);

	public User existingEmail(String email);

	public User checkLogin(String username, String password);
}
