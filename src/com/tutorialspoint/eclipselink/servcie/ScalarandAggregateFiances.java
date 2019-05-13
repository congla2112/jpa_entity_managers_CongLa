package com.tutorialspoint.eclipselink.servcie;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ScalarandAggregateFiances {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("guidespoint_JPA_Eclipselink");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		Query query =  entitymanager.createQuery("SELECT UPPER(e.ename) from Employee e");
		List<String> list = query.getResultList();
		
		for(String e: list) {
			System.out.println("Name: "+e);
		}
		
		
		Query query1 = entitymanager.createQuery("SELECT MAX(e.salary) FROM Employee e");
		Double result = (Double) query1.getSingleResult();
		System.out.println("Max Salary: "+result);
		
		
		}
	

}
