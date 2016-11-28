package io.wzw.backend.data.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import io.wzw.backend.data.HibernateUtil;
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
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		User user = (User) session.createQuery("FROM User u WHERE  s.username = :username")
				.setParameter("username", username).uniqueResult();
		session.close();
		return user;
	}

	public User existingEmail(String email) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
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
}
