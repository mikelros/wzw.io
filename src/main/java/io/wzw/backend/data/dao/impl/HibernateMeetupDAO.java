package io.wzw.backend.data.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import io.wzw.backend.data.HibernateSession;
import io.wzw.backend.data.dao.MeetupDAO;
import io.wzw.backend.data.model.Meetup;

public class HibernateMeetupDAO implements MeetupDAO{
	
	public Meetup selectById(Integer id) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		Meetup meetup = (Meetup) session.get(Meetup.class, id);
		session.close();
		return meetup;
	}

	public List<Meetup> selectAll() {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		List<Meetup> meetups = session.createCriteria(Meetup.class).list();
		session.close();
		return meetups;
	}

	public void insert(Meetup meetup) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Integer id = (Integer) session.save(meetup);
		meetup.setId(id);
		session.getTransaction().commit();
		session.close();
		
	}

	public void update(Meetup meetup) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.merge(meetup);
		session.getTransaction().commit();
		session.close();
		
	}

	public void delete(Meetup meetup) {
		SessionFactory sessionFactory = HibernateSession.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(meetup);
		session.getTransaction().commit();
		session.close();
		
	}
}
