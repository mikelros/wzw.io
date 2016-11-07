package io.wzw.backend.data.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import io.wzw.backend.data.HibernateSession;
import io.wzw.backend.data.dao.UserDAO;
import io.wzw.backend.data.model.User;

/**
 * Hibernate specific User DAO
 * @author Mikel
 *
 */
public class HibernateUserDAO extends GenericDAOHibernate<User> implements UserDAO {
	
	
}
