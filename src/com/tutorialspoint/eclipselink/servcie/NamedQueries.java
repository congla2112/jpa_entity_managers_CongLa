package com.tutorialspoint.eclipselink.servcie;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tutorialspoint.eclipselink.entity.Employee;

public class NamedQueries {
	public static void main(String[]args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("guidespoint_JPA_Eclipselink");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		Query query = entitymanager.createNamedQuery("find Employee by id");
		query.setParameter("id", 355);
		List<Employee> list = query.getResultList();
		for(Employee a:list) {
			System.out.println("Id :"+a.getEid());
			System.out.println("\t Name :"+a.getEname());
			System.out.println("\t\t Salary :"+a.getSalary());
		}
		
		
	}
}
