package com.tutorialspoint.eclipselink.servcie;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.tutorialspoint.eclipselink.entity.Employee;

public class CriteriaAPI {
	
	public static void main(String[]args) {
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("guidespoint_JPA_Eclipselink");
		EntityManager enmanager = emfactory.createEntityManager();
		CriteriaBuilder criteraBuilder = enmanager.getCriteriaBuilder();
		CriteriaQuery<Object> criteriaQuery = criteraBuilder.createQuery();
		Root<Employee> from = criteriaQuery.from(Employee.class);
		
		System.out.println("select all record");
		CriteriaQuery<Object> select = criteriaQuery.select(from);
		TypedQuery<Object> typedQuery = enmanager.createQuery(select);
		List<Object> resultlist = typedQuery.getResultList();
		
		for(Object o : resultlist) {
			Employee e = (Employee)o;
			System.out.println("Eid: "+e.getEid()+ " Ename: "+e.getEname());
		}
		 
		System.out.println("select all record by follow odering");
		CriteriaQuery<Object> select1 =criteriaQuery.select(from);
		select1.orderBy(criteraBuilder.asc(from.get("ename")));
		TypedQuery<Object> typedQuery1 = enmanager.createQuery(select);
		List<Object> resultlist1 = typedQuery1.getResultList();
		
		for(Object O : resultlist1) {
			Employee e = (Employee)O;
			System.out.println("Eid :"+e.getEid()+ " Ename: "+e.getEname());
			
			
			
			
		}
		
		enmanager.close();
		emfactory.close();
		
	}

}

