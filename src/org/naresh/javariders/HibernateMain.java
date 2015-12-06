/**
 * 
 */
package org.naresh.javariders;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.naresh.javariders.dto.Address;
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

		userDetails.setUserName("Naresh");
		Address addr = new Address();
		addr.setCity("Hyd");
		addr.setState("TS");
		addr.setStreet("Madinaguda");
		addr.setPinCode("500049");
		
		Address addr2 = new Address();
			addr2.setCity("Hyd");
			addr2.setState("TS");
			addr2.setStreet("Hi-Tech");
			addr2.setPinCode("500080");
			
		userDetails.setDescription("Description Naresh");
		userDetails.setJoinedDate(new Date());
		
		//userDetails.getAddress().add(addr2);
		//userDetails.getAddress().add(addr);
	
		
		
		
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
		session.close();
	//	System.out.println(userDetails.getAddress().size());
		
	}

}
