package org.charan.object;



import org.charan.UserDetails;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user=new UserDetails();
		
		user.setUserName("first User");
		
UserDetails user2=new UserDetails();
		
		user2.setUserName("Second User");
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		session.close();
		
		/*user=null;
		session=sessionFactory.openSession();
		session.beginTransaction();
		user= (UserDetails) session.get(UserDetails.class, 1);
		System.out.println("Username"+ user.getUserName());
		*/
		
		
	}

}
