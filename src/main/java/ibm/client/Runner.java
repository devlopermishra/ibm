package ibm.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import ibm.entity.Student;

public class Runner {

	public static void main(String[] args) {
		Student pra = new Student(2,"Alok","male","noida");
		Configuration cfg = new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(pra);
		System.out.println("new change");
		tx.commit();
	}

}
