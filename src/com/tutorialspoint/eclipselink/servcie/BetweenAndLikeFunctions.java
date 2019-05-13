package com.tutorialspoint.eclipselink.servcie;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tutorialspoint.eclipselink.entity.Employee;

public class BetweenAndLikeFunctions {
	
	public static void main(String []args) { 
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("guidespoint_JPA_Eclipselink");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		Query query1 = entitymanager.createQuery("SELECT a FROM Employee a");
		List<Employee> list1 = query1.getResultList();
		for(Employee c: list1) {
			System.out.println("Name: "+c.getEname());
		}
		
		Query query = entitymanager.createQuery("SELECT e " + "FROM Employee e" + " WHERE e.salary" + " BETWEEN 100000 and 100000000 ");
		List<Employee> list2 =  query.getResultList();
	
		for(Employee e:list2) {
			System.out.println("Id: "+e.getEname());
			System.out.println("\t Salary: "+e.getSalary());
		}
	}
}
