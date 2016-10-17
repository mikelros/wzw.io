package io.wzw.backend.data.dao.impl;


import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.wzw.backend.data.dao.UserRoleDAO;
import io.wzw.backend.data.dao.impl.HibernateUserRoleDAO;
import io.wzw.backend.data.model.UserRole;
import io.wzw.backend.data.model.UserRole;
import io.wzw.backend.data.model.UserRole;
import io.wzw.backend.data.model.UserRole;
import io.wzw.backend.data.model.UserRole;

public class HibernateUserRoleDAOTest {

	
	private UserRoleDAO userRoleDAO;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		userRoleDAO = new HibernateUserRoleDAO();
	}
	
	@Test
	public void testSelectByIdAuto() {
		UserRole insertUserRole = new UserRole(1234, 1234, 1234);
		userRoleDAO.insert(insertUserRole);
		UserRole userRole = userRoleDAO.selectByIdAuto(insertUserRole.getIdAuto());
		assertEquals("Select by Id should exist",userRole.getIdAuto(), insertUserRole.getIdAuto());
	}
	
	@Test
	public void testSelectAll() {
		int totalElements = userRoleDAO.selectAll().size();
		
		UserRole insertUserRole = new UserRole(1234, 1234, 1234);
		userRoleDAO.insert(insertUserRole);
		int totalElementsAfterInsert = userRoleDAO.selectAll().size();
		
		assertEquals("Select All returns all elements",totalElements + 1, totalElementsAfterInsert);
	}
	
	@Test
	public void testInsert() {
		int totalElements = userRoleDAO.selectAll().size();
		UserRole insertUserRole = new UserRole(null, 1234, 1234);
		userRoleDAO.insert(insertUserRole);
		assertEquals("User inserted", userRoleDAO.selectAll().size() + 1, totalElements);
	}
	
	@Test
	public void testUpdate() {
		Integer updatedIdUser = 1235;
		
		// Select after first insert
		UserRole insertUserRole = new UserRole(1234, 1234, 1234);
		userRoleDAO.insert(insertUserRole);
		
		// We update the role
		insertUserRole.setIdUser(updatedIdUser);
		userRoleDAO.update(insertUserRole);
		
		// Select and check if name has changed
		UserRole updatedIdUserRole = userRoleDAO.selectByIdAuto(insertUserRole.getIdAuto());
		
		assertEquals("User name was changed", updatedIdUserRole, updatedIdUserRole.getIdUser());
	}

	public void testDelete() {
		// Select after first insert
		UserRole insertUserRole = new UserRole(1234, 1234, 1234);
		userRoleDAO.insert(insertUserRole);
		
		// Delete 
		userRoleDAO.delete(insertUserRole);
		UserRole userRole = userRoleDAO.selectByIdAuto(insertUserRole.getIdAuto());
		assertNull("Select by Id with a deleted record id shoud be null", userRole);
	}
}
