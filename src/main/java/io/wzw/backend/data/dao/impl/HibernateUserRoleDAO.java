package io.wzw.backend.data.dao.impl;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import io.wzw.backend.data.HibernateSession;
import io.wzw.backend.data.dao.UserRoleDAO;
import io.wzw.backend.data.model.Role;
import io.wzw.backend.data.model.User;
import io.wzw.backend.data.model.UserRole;

public class HibernateUserRoleDAO implements UserRoleDAO{

	public UserRole selectByIdAuto(Integer idAuto) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		UserRole userRole = (UserRole) session.get(UserRole.class, idAuto);
		session.close();
		return userRole;
	}
	
	public UserRole selectByIdUser(Integer idUser) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		UserRole userRole = (UserRole) session.get(UserRole.class, idUser);
		session.close();
		return userRole;
	}

	public UserRole selectByIdRole(Integer idRole) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		UserRole userRole = (UserRole) session.get(UserRole.class, idRole);
		session.close();
		return userRole;
	}

	public List<UserRole> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<UserRole> userRoles = session.createCriteria(UserRole.class).list();
		session.close();
		return userRoles;
	}

	public void insert(UserRole userRole) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Integer id = (Integer) session.save(userRole);
		userRole.setIdAuto(id);
		session.getTransaction().commit();
		session.close();
	}

	public void update(UserRole userRole) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(userRole);
		session.getTransaction().commit();
		session.close();
		
	}

	public void delete(UserRole userRole) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(userRole);
		session.getTransaction().commit();
		session.close();
		
	}

	
	
}
