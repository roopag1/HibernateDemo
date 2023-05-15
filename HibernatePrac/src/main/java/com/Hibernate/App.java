package com.Hibernate;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	EmployeeName name = new EmployeeName();
    	name.setFname("roopa");
    	name.setLname("blr");
    	Employee emp = new Employee();
    	emp.setId(101);
    	emp.setCountry("INDIA");
    	emp.setName(name);
    	
    
    	
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
    	
    	//ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
    	
    	 SessionFactory factory = config.buildSessionFactory();
    	
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	 session.save(emp);
    	
    //	emp = session.get(Employee.class, 104);
    	
    	tx.commit();
    	System.out.println(emp);
    }
}
