package com.tutorialspoint.eclipselink.servcie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.tutorialspoint.eclipselink.entity.Employee;
public class UpdateEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("guidespoint_JPA_Eclipselink");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Employee employee = entitymanager.find(Employee.class, 51);
		
		
		System.out.println(employee);
		employee.setSalary(50000000);
		employee.setEname("CongLa");
		employee.setDeg("Admin");
		entitymanager.getTransaction().commit();
		
		System.out.println(employee);
		entitymanager.close();
		emfactory.close();
				
	}
}