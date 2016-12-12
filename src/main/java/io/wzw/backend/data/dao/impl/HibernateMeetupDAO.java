package io.wzw.backend.data.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import io.wzw.backend.data.dao.MeetupDAO;
import io.wzw.backend.data.model.Meetup;
import io.wzw.backend.data.model.User;

public class HibernateMeetupDAO extends GenericDAOHibernate<Meetup> implements MeetupDAO{
	public Meetup getUserMeetupById(Long idUser, Long idMeetup) {
		startTransaction();
		Session session = getSession();
		Object result = null;

		try {
			result = session.createQuery("SELECT m FROM " + Meetup.class.getSimpleName() + " m INNER JOIN m.User as u WHERE u.id = :idUser AND m.id = :idMeet")
					.setParameter("idUser", idUser)
					.setParameter("idMeet", idMeetup)
					.uniqueResult();
		} catch (HibernateException ex) {
			ex.printStackTrace();
		} finally {
			endTransaction();
		}

		return result == null ? null : (Meetup) result;
	}

	public List<Meetup> lastEvents(Long idUser, Long idMeetup) {
		List<Meetup> result = null;
		
		try {
			startTransaction();
			result = getSession().createQuery(
					"SELECT m FROM " + Meetup.class.getSimpleName() +
					" m INNER JOIN m.User as u WHERE u.id = :idUser " + 
					"AND m.id < :idMeet").setParameter("idUser", idUser).setParameter("idMeet", idMeetup).setMaxResults(10).list();
			
		} catch (HibernateException he) {
			handleException(he);
		} finally {
			endTransaction();
		}
		return result;

	}
	
	public List<Meetup> lastEvents(Long idUser) {
		List<Meetup> result = null;
		
		try {
			startTransaction();
			result = getSession().createQuery(
					"SELECT m FROM " + Meetup.class.getSimpleName() +
					" m INNER JOIN m.User as u WHERE u.id = :idUser ").setParameter("idUser", idUser).setMaxResults(10).list();
			
		} catch (HibernateException he) {
			handleException(he);
		} finally {
			endTransaction();
		}
		return result;

	}
	
}
