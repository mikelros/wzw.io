package io.wzw.backend.data.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import io.wzw.backend.data.dao.UserDAO;
import io.wzw.backend.data.model.User;

/**
 * Hibernate specific User DAO
 * 
 * @author Mikel
 *
 */

public class HibernateUserDAO extends GenericDAOHibernate<User> implements UserDAO {
	public User existingUser(String username) {
		startTransaction();
		Session session = getSession();
		User user = (User) session.createQuery("FROM User u WHERE u.username = :username")
				.setParameter("username", username).uniqueResult();
		session.close();
		return user;
	}

	public User existingEmail(String email) {
		startTransaction();
		Session session = getSession();
		Object result = null;

		try {
			result = session.createCriteria(User.class).add(Restrictions.eq("email", email)).uniqueResult();
		} catch (HibernateException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}

		return result == null ? null : (User) result;
	}
	
	public User checkLogin(String username, String password){
		User user = null;
		startTransaction();
		try {
			user = (User) getSession().createSQLQuery("SELECT * FROM User u WHERE u.username ").addEntity(User.class);;
		} catch (HibernateException ex) {
			ex.printStackTrace();
		} finally {
			getSession().close();
		}
		
		return user;
	}
}
