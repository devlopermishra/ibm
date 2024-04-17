package ibmLearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import ibm.Entity.Student;
import ibm.Configration.HibernateConfigration;




public class Runner {
	public static void main(String[] args) {
		SessionFactory sf = HibernateConfigration.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("start...........");
		Student e = new Student(5,"durgeshwary","female","lanka");

		
		session.persist(e);
		tx.commit();
		
		
		
	}

}
