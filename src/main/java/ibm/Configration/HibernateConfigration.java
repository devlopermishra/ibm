package ibm.Configration;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class HibernateConfigration {

	 public static SessionFactory getSessionFactory() {
	        
	       
	            Properties properties = new Properties();
	            properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
	           
	            properties.put(Environment.URL, "jdbc:mysql://localhost:3306/ducat");
	            properties.put("hibernate.connection.username", "root")	;
	            properties.put(Environment.PASS, "root");
	            
	            
	           
	            properties.put(Environment.SHOW_SQL, "true");
	            properties.put(Environment.HBM2DDL_AUTO, "update");
	            properties.put(Environment.FORMAT_SQL, "true");
	            
	            StandardServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings
	            		(properties).build();
	           
	            MetadataSources metadataSources = new MetadataSources(registry);
	            metadataSources.addAnnotatedClassName ("ibm.Entity.Student");
	            
	            SessionFactory sessionFactory = metadataSources.buildMetadata().buildSessionFactory();

	            return sessionFactory;
	        }
	    }

