/**
 * 
 */
package io.wzw.backend.data.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import io.wzw.backend.data.HibernateUtil;
import io.wzw.backend.data.dao.GenericDAO;

/**
 * generic DAO
 * @author Eugenia Pérez
 * @email eugenia_perez@cuatrovientos.org
 */
public class GenericDAOHibernate<T> implements GenericDAO<T>,Serializable {

	private Session session;

	/**
	 * starts transaction
	 */
	protected void startTransaction() {
		session = HibernateUtil.getSession();
		
		session.getTransaction().begin();
	}

	/**
	 * ends transaction
	 */
	protected void endTransaction() {
		session.getTransaction().commit();
		session.close();
	}

	/**
	 * handles exception, rolls back operations
	 * @param he
	 * @throws HibernateException
	 */
	protected void handleException(HibernateException he)
			throws HibernateException {
		System.out.println("Exception: " + he.getMessage());
		
		if (null != session && session.isOpen()) {
			session.getTransaction().rollback();
		}
		throw he;
	}

	/**
	 * returns Hibernate Session instance
	 * @return
	 */
	protected Session getSession() {
		return session;
	}

	/**
	 * saveOrUpdate
	 */
	public void insert(T entity) throws HibernateException {
		try {
			startTransaction();
			getSession().save(entity);
		} catch (HibernateException he) {
			handleException(he);
		} finally {
			endTransaction();
		}
	}
	
	/**
	 * saveOrUpdate
	 */
	public void update(T entity) throws HibernateException {
		try {
			startTransaction();
			getSession().merge(entity);
		} catch (HibernateException he) {
			handleException(he);
		} finally {
			endTransaction();
		}
	}

	/**
	 * finds one entity
	 * @param id
	 * @param entityClass
	 * @return
	 * @throws HibernateException
	 */
	public T selectById(Serializable id, Class<T> entityClass)
			throws HibernateException {
		T obj = null;
		try {
			startTransaction();
			obj = (T) getSession().get(entityClass, id);
		} catch (HibernateException he) {
			handleException(he);
		} finally {
			endTransaction();
		}
		return obj;
	}

	/**
	 * get all entities
	 * @param entityClass
	 * @return
	 * @throws HibernateException
	 */
	public List<T> selectAll(Class entityClass) throws HibernateException {
		List<T> result = null;
		try {
			startTransaction();
			result = getSession().createQuery(
					"From " + entityClass.getSimpleName()).list();

		} catch (HibernateException he) {
			
			handleException(he);
		} finally {
			endTransaction();
		}
		return result;
	}


	/* (non-Javadoc)
	 * @see com.sistema.ud4.u4act11.dao.GenericDAOInterface#delete(java.lang.Object)
	 */
	public void delete(T entityClass) throws HibernateException {
		try {
			startTransaction();
			getSession().delete(entityClass);
			getSession().flush();
		} catch (HibernateException he) {
			handleException(he);
		} finally {
			endTransaction();
		}
		
	}
}
