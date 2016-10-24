package io.wzw.backend.data.dao.impl;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.wzw.backend.data.dao.MeetupDAO;
import io.wzw.backend.data.dao.impl.HibernateMeetupDAO;
import io.wzw.backend.data.model.Meetup;
import io.wzw.backend.data.model.User;

public class HibernateMeetupDAOTest {

	private MeetupDAO meetupDAO;

	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		meetupDAO = new HibernateMeetupDAO();
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testSelectById() {
		// Select after insert
		Meetup insertMeetup = new Meetup(1,"Admin","Administrator role", new Date(1992, 04, 19), new Date(1992, 04, 12), 1, 19.015f, 20.013f, new User());
				meetupDAO.insert(insertMeetup);
		Meetup meetup = meetupDAO.selectById(insertMeetup.getId());
		assertEquals("Select by Id should exist",meetup.getId(), insertMeetup.getId());
		
	}

	/**
	 * Test method for {@link io.wzw.backend.data.dao.impl.HibernateRoleDAO#selectAll()}.
	 */
	@Test
	public void testSelectAll() {
		int totalElements = meetupDAO.selectAll().size();
		Meetup insertMeetup = new Meetup(1,"Admin","Administrator role", new Date(1992, 04, 19), new Date(1992, 04, 12), 1, 19.015f, 20.013f, new User());
		meetupDAO.insert(insertMeetup);
		int totalElementsAfterInsert = meetupDAO.selectAll().size();
		
		assertEquals("Select All returns all elements",totalElements + 1, totalElementsAfterInsert);
	}

	/**
	 * Test method for {@link io.wzw.backend.data.dao.impl.HibernateRoleDAO#insert(io.wzw.backend.data.model.Role)}.
	 */
	@Test
	public void testInsert() {
		Meetup insertMeetup =  new Meetup(1,"Admin","Administrator role", new Date(1992, 04, 19), new Date(1992, 04, 12), 1, 19.015f, 20.013f, new User());
		meetupDAO.insert(insertMeetup);
		
		Meetup meetup = meetupDAO.selectById(insertMeetup.getId());
		
		assertNotNull("Select by Id with a inserted record id shoudn't be null",meetup);
	}

	/**
	 * Test method for {@link io.wzw.backend.data.dao.impl.HibernateRoleDAO#update(io.wzw.backend.data.model.Role)}.
	 */
	@Test
	public void testUpdate() {
		String updatedName = "Admin changed";
		
		// Select after first insert
		Meetup insertMeetup = new Meetup(1,"Admin","Administrator role", new Date(1992, 04, 19), new Date(1992, 04, 12), 1, 19.015f, 20.013f, new User());
		meetupDAO.insert(insertMeetup);
		
		// We update the role
		insertMeetup.setName(updatedName);
		meetupDAO.update(insertMeetup);
		
		// Select and check if name has changed
		Meetup updatedMeetup = meetupDAO.selectById(insertMeetup.getId());
		
		assertEquals("Role name was changed", updatedName, updatedMeetup.getName());
	}

	/**
	 * Test method for {@link io.wzw.backend.data.dao.impl.HibernateRoleDAO#delete(io.wzw.backend.data.model.Role)}.
	 */
	@Test
	public void testDelete() {
		// Select after first insert
		Meetup insertMeetup = new Meetup(1,"Admin","Administrator role", new Date(1992, 04, 19), new Date(1992, 04, 12), 1, 19.015f, 20.013f, new User());
		meetupDAO.insert(insertMeetup);
		
		// Delete 
		meetupDAO.delete(insertMeetup);
		Meetup memetup = meetupDAO.selectById(insertMeetup.getId());
		assertNull("Select by Id with a deleted record id shoud be null",memetup);
		
	}

}
