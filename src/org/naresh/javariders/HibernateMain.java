/**
 * 
 */
package org.naresh.javariders;

import java.util.Date;

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
		userDetails.setUserName("Third Naresh");
		userDetails.setAddress("Addre Naresh");
		userDetails.setDescription("Description Naresh");
		userDetails.setJoinedDate(new Date());

		Configuration config =	new Configuration().configure();
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		session.save(userDetails);
		session.getTransaction().commit();
		session.close();
		
		
		userDetails = null;
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		userDetails = (UserDetails) session.get(UserDetails.class, 1);
		
		System.out.println(userDetails.getUserName());
		
		
		
	}

}
