/**
 * 
 */
package io.wzw.backend.data;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import io.wzw.backend.data.dao.RoleDAO;
import io.wzw.backend.data.dao.impl.HibernateRoleDAO;
import io.wzw.backend.data.model.Role;

/**
 * @author PELLO_ALTADILL
 *
 */
public class HibernateRoleDAOTest {
	private RoleDAO roleDAO;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		roleDAO = new HibernateRoleDAO();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link io.wzw.backend.data.dao.impl.HibernateRoleDAO#selectById(java.lang.Long)}.
	 */
	@Test
	public void testSelectById() {		
		// Select after insert
		Role insertRole = new Role(null,"Admin","Administrator role");
		roleDAO.insert(insertRole);
		Role role = roleDAO.selectById(insertRole.getId());
		assertEquals("Select by Id should exist",role.getId(), insertRole.getId());
		
	}

	/**
	 * Test method for {@link io.wzw.backend.data.dao.impl.HibernateRoleDAO#selectAll()}.
	 */
	@Test
	public void testSelectAll() {
		int totalElements = roleDAO.selectAll().size();
		
		Role insertRole = new Role(null,"Admin","Administrator role");
		roleDAO.insert(insertRole);
		int totalElementsAfterInsert = roleDAO.selectAll().size();
		
		assertEquals("Select All returns all elements",totalElements + 1, totalElementsAfterInsert);
	}

	/**
	 * Test method for {@link io.wzw.backend.data.dao.impl.HibernateRoleDAO#insert(io.wzw.backend.data.model.Role)}.
	 */
	@Test
	public void testInsert() {
		assertTrue("Insert",true);
	}

	/**
	 * Test method for {@link io.wzw.backend.data.dao.impl.HibernateRoleDAO#update(io.wzw.backend.data.model.Role)}.
	 */
	@Test
	public void testUpdate() {
		String updatedName = "Admin changed";
		
		// Select after first insert
		Role insertRole = new Role(null,"Admin","Administrator role");
		roleDAO.insert(insertRole);
		
		// We update the role
		insertRole.setName(updatedName);
		roleDAO.update(insertRole);
		
		// Select and check if name has changed
		Role updatedRole = roleDAO.selectById(insertRole.getId());
		
		assertEquals("Role name was changed", updatedName, updatedRole.getName());
	}

	/**
	 * Test method for {@link io.wzw.backend.data.dao.impl.HibernateRoleDAO#delete(io.wzw.backend.data.model.Role)}.
	 */
	@Test
	public void testDelete() {
		// Select after first insert
		Role insertRole = new Role(null,"Admin","Administrator role");
		roleDAO.insert(insertRole);
		
		// Delete 
		roleDAO.delete(insertRole);
		Role role = roleDAO.selectById(insertRole.getId());
		assertNull("Select by Id with a deleted record id shoud be null",role);
		
	}

}
