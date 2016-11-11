package io.wzw.backend.data.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import io.wzw.backend.data.HibernateSession;
import io.wzw.backend.data.dao.MeetupDAO;
import io.wzw.backend.data.model.Meetup;

public class HibernateMeetupDAO extends GenericDAOHibernate<Meetup> implements MeetupDAO{

}
