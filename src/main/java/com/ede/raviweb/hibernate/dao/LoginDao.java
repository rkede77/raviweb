/**
 * 
 */
package com.ede.raviweb.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.ede.raviweb.hibernate.entity.LoginEntity;
import com.ede.raviweb.utils.HibernateUtil;

/**
 * @author ravik
 *
 */
@Repository
public class LoginDao {
	
	public void createLoginEde(LoginEntity loginEdeModel)
	{
		SessionFactory sessFact = HibernateUtil.getSessionFactory();
		Session session = sessFact.openSession();
		Transaction tr = session.beginTransaction();
		session.save(loginEdeModel);
		tr.commit();
		System.out.println("Successfully inserted");	
		session.close();
		sessFact.close();
	}

}
