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
public class HibernateUserDAO implements UserDAO {

	public User selectById(Integer id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		User user = (User) session.get(User.class, id);
		session.close();
		return user;
	}

	public List<User> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<User> users = session.createCriteria(User.class).list();
		session.close();
		return users;
	}

	public void insert(User user) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Integer id = (Integer) session.save(user);
		user.setId(id);
		session.getTransaction().commit();
		session.close();
		
	}

	public void update(User user) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(user);
		session.getTransaction().commit();
		session.close();
		
	}

	public void delete(User user) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(user);
		session.getTransaction().commit();
		session.close();
		
	}
	
}
