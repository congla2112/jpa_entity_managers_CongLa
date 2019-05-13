package com.tutorialspoint.eclipselink.servcie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tutorialspoint.eclipselink.entity.Employee;

public class FindEmployee {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("guidespoint_JPA_Eclipselink");
		EntityManager entitymanager = emfactory.createEntityManager();
		Employee employee = entitymanager.find(Employee.class, 51);
		
		System.out.println("id: "+ employee.getEid());
		System.out.println("Name: "+ employee.getEname());
		System.out.println("Salary: "+ employee.getSalary());
		System.out.println("Deg: "+ employee.getDeg());
		
	}
}
