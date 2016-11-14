package org.charan.obj;



import org.charan.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user=new UserDetails();
		user.setUserId(1);
		user.setUserName("first User");
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
		
		
	}

}
