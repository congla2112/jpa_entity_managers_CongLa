package com.tutorialspoint.eclipselink.servcie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tutorialspoint.eclipselink.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("guidespoint_JPA_Eclipselink");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();

		
		
		Employee employee2 = new Employee();
		employee2.setEname("Thuong");
		employee2.setSalary(4000000);
		employee2.setDeg("Technical Manager");
		
		Employee employee3 = new Employee();
		employee3.setEname("Nghia");
		employee3.setSalary(3000000);
		employee3.setDeg("Technical ");
		
		Employee employee4 = new Employee();
		employee4.setEname("Huong");
		employee4.setSalary(200000);
		employee4.setDeg("Technical Manager");

		Employee employee = new Employee();
		employee.setEname("Gopal");
		employee.setSalary(40000);
		employee.setDeg("Technical Manager");
		
		Employee employee1 = new Employee();
		employee1.setEname("Tan");
		employee1.setSalary(25000000);
		employee1.setDeg(" Manager"); 
		
		entitymanager.persist(employee2);
		entitymanager.persist(employee3);
		entitymanager.persist(employee4);
		entitymanager.persist(employee);
		entitymanager.persist(employee1);
		
		entitymanager.getTransaction().commit();
		
		
		

		entitymanager.close();
		emfactory.close();
	}
}
