package io.wzw.backend.data.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import io.wzw.backend.data.HibernateSession;
import io.wzw.backend.data.dao.RoleDAO;
import io.wzw.backend.data.model.Role;

/**
 * Hibernate specific Role DAO
 * 
 * @author David
 *
 */
public class HibernateRoleDAO implements RoleDAO {

	public Role selectById(Integer id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		Role role = (Role) session.get(Role.class, id);
		session.close();
		return role;
	}

	public List<Role> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Role> roles = session.createCriteria(Role.class).list();
		session.close();
		return roles;
	}

	public void insert(Role role) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Integer id = (Integer) session.save(role);
		role.setId(id);
		session.getTransaction().commit();
		session.close();

	}

	public void update(Role role) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(role);
		session.getTransaction().commit();
		session.close();

	}

	public void delete(Role role) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(role);
		session.getTransaction().commit();
		session.close();

	}

}
