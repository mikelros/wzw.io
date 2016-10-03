package io.wzw.backend.data.dao.impl;



import org.hibernate.Session;
import org.hibernate.SessionFactory;

import io.wzw.backend.data.HibernateSession;
import io.wzw.backend.data.dao.UserRoleDAO;
import io.wzw.backend.data.model.Role;
import io.wzw.backend.data.model.UserRole;

public class HibernateUserRoleDAO implements UserRoleDAO{

	public UserRole selectByAutoId(Long autoId) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		UserRole userRole = (UserRole) session.get(UserRole.class, autoId);
		session.close();
		return userRole;
	}
	
	public UserRole selectByIdUser(Long idUser) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		UserRole userRole = (UserRole) session.get(UserRole.class, idUser);
		session.close();
		return userRole;
	}

	public UserRole selectByIdRole(Long idRole) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		UserRole userRole = (UserRole) session.get(UserRole.class, idRole);
		session.close();
		return userRole;
	}

	
	
}
