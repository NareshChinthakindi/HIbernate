/**
 * 
 */
package org.naresh.javariders;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.naresh.javariders.dto.UserDetails;

/**
 * @author Naresh
 *
 */
public class HibernateMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		UserDetails userDetails = new UserDetails();

		userDetails.setUserId(1);
		userDetails.setUserName("Naresh");

		Configuration config =	new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(userDetails);
		session.getTransaction().commit();
	}

}
