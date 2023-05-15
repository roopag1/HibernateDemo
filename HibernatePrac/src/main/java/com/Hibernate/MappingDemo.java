package com.Hibernate;



import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {


		Equipment eq = new Equipment();
		eq.setEqid(101);
		eq.setName("Apple Macbook");
	
		
		
		
		Equipment eq1 = new Equipment();
		eq1.setEqid(102);
		eq1.setName("Windows");
		
	
		List<Equipment> list = Arrays.asList(eq, eq1);

		EmployeeName name = new EmployeeName();
		name.setFname("roo");
		name.setLname("blr");

		Employee emp = new Employee();
		emp.setId(105);
		emp.setCountry("INDIA");
		emp.setName(name);
		// emp.setEquipment(eq);
		emp.setEquipments(list);

		
		eq.getEmployees().add(emp);


		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Equipment.class);

		//ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();

		SessionFactory factory = config.buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();
		
		session.save(eq);
		session.save(eq1);

		session.save(emp);

		session.getTransaction().commit();

	}

}
