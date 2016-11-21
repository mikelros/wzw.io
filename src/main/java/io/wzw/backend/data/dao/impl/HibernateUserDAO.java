package io.wzw.backend.data.dao.impl;

import io.wzw.backend.data.dao.UserDAO;
import io.wzw.backend.data.model.User;

/**
 * Hibernate specific User DAO
 * @author Mikel
 *
 */

public class HibernateUserDAO extends GenericDAOHibernate<User> implements  UserDAO {
	
}
