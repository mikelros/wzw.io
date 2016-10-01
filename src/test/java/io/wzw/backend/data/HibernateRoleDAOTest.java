/**
 * 
 */
package io.wzw.backend.data;

import static org.junit.Assert.*;

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
		Integer id = 2;
		Role role = roleDAO.selectById(id);
		assertNull("Select by Id with an empty table shoud be null",role);
		
		// Select after first insert
		Role insertRole = new Role(null,"Admin","Administrator role");
		roleDAO.insert(insertRole);
		role = roleDAO.selectById(insertRole.getId());
		assertEquals("Select by Id should exist",role.getId(), insertRole.getId());
		
	}

	/**
	 * Test method for {@link io.wzw.backend.data.dao.impl.HibernateRoleDAO#selectAll()}.
	 */
	@Test
	public void testSelectAll() {
		assertTrue("Select All",true);
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
		assertTrue("Update",true);
	}

	/**
	 * Test method for {@link io.wzw.backend.data.dao.impl.HibernateRoleDAO#delete(io.wzw.backend.data.model.Role)}.
	 */
	@Test
	public void testDelete() {
		assertTrue("Delete",true);
	}

}
