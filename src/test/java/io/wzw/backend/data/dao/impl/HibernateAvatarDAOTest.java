package io.wzw.backend.data.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.wzw.backend.data.dao.AvatarDAO;
import io.wzw.backend.data.dao.impl.HibernateAvatarDAO;
import io.wzw.backend.data.model.Avatar;
import io.wzw.backend.data.model.User;

public class HibernateAvatarDAOTest {

	private AvatarDAO avatarDAO;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		avatarDAO = new HibernateAvatarDAO();
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
		Avatar insertAvatar = new Avatar(null,"Admin","Administrator role", new User());
		avatarDAO.insert(insertAvatar);
		Avatar avatar = avatarDAO.selectById(insertAvatar.getId(), Avatar.class);
		assertEquals("Select by Id should exist",avatar.getId(), insertAvatar.getId());
		
	}

	/**
	 * Test method for {@link io.wzw.backend.data.dao.impl.HibernateRoleDAO#selectAll()}.
	 */
	@Test
	public void testSelectAll() {
		int totalElements = avatarDAO.selectAll(Avatar.class).size();
		//int totalElements = totalElementsAux == null ? 0 : totalElementsAux.size();
		
		Avatar insertAvatar = new Avatar(null,"Admin","Administrator role", new User());
		avatarDAO.insert(insertAvatar);
		int totalElementsAfterInsert = avatarDAO.selectAll(Avatar.class).size();
		
		assertEquals("Select All returns all elements",totalElements + 1, totalElementsAfterInsert);
	}

	/**
	 * Test method for {@link io.wzw.backend.data.dao.impl.HibernateRoleDAO#insert(io.wzw.backend.data.model.Role)}.
	 */
	@Test
	public void testInsert() {
		Avatar insertAvatar = new Avatar(null, "Admin", "Administrator role", new User());
		avatarDAO.insert(insertAvatar);
		
		Avatar avatar = avatarDAO.selectById(insertAvatar.getId(), Avatar.class);
		
		assertNotNull("Select by Id with a inserted record id shoudn't be null",avatar);
	}

	/**
	 * Test method for {@link io.wzw.backend.data.dao.impl.HibernateRoleDAO#update(io.wzw.backend.data.model.Role)}.
	 */
	@Test
	public void testUpdate() {
		String updatedName = "Admin changed";
		
		// Select after first insert
		Avatar insertAvatar = new Avatar(null,"Admin","Administrator role", new User());
		avatarDAO.insert(insertAvatar);
		
		// We update the role
		insertAvatar.setDescription(updatedName);
		avatarDAO.update(insertAvatar);
		
		// Select and check if name has changed
		Avatar updatedAvatar = avatarDAO.selectById(insertAvatar.getId(), Avatar.class);
		
		assertEquals("Role name was changed", updatedName, updatedAvatar.getDescription());
	}

	/**
	 * Test method for {@link io.wzw.backend.data.dao.impl.HibernateRoleDAO#delete(io.wzw.backend.data.model.Role)}.
	 */
	@Test
	public void testDelete() {
		// Select after first insert
		Avatar insertAvatar = new Avatar(null,"Admin","Administrator role", new User());
		avatarDAO.insert(insertAvatar);
		
		// Delete 
		avatarDAO.delete(insertAvatar);
		Avatar avatar = avatarDAO.selectById(insertAvatar.getId(), Avatar.class);
		assertNull("Select by Id with a deleted record id shoud be null",avatar);
		
	}

}
