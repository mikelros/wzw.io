package io.wzw.backend.data.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import io.wzw.backend.data.HibernateUtil;
import io.wzw.backend.data.dao.UserDAO;
import io.wzw.backend.data.model.User;

/**
 * Hibernate specific User DAO
 * @author Mikel
 *
 */

public class HibernateUserDAO extends GenericDAOHibernate<User> implements  UserDAO {
	public User existingUser(String username) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	    Session session = sessionFactory.openSession();
	    User user = (User) session.get(User.class, username);
	    session.close();
	    return user;
	}	
}
