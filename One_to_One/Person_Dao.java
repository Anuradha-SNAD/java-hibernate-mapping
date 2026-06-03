package org.snad.uni;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Person_Dao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void save(Person person) {
		et.begin();
		em.persist(person);
		et.commit();
		System.out.println("Data Inserted...");
	}
	public void save(Address address) {
		et.begin();
		em.persist(address);
		et.commit();
		System.out.println("Data Inserted...");
	}
	public void fetch(int id) {
		Person person = em.find(Person.class, id);
		if(person != null) {
			System.out.println(person);
		}else {
	        System.out.println("Person Not Found");
	    }
	}
	public void update(int id,String name) {
		Person person = em.find(Person.class, id);
		if(person != null) {
			et.begin();
			person.setName(name);
			et.commit();
			System.out.println("Updated");
		}else {
	        System.out.println("Person Not Found");
	    }
	}
	public void updateAddress(int id,String s) {
		Person person = em.find(Person.class, id);
		if(person != null) {
			et.begin();
			person.getAddress().setState(s);;
			et.commit();
			System.out.println("Updated");
		}else {
	        System.out.println("Person Not Found");
	    }
		
	}
	public void delete(int id) {
		Person person = em.find(Person.class, id);
			if(person != null) {
				et.begin();
				em.remove(person);
				et.commit();
			System.out.println("deleted..");
			}else {
		        System.out.println("Person Not Found");
		    }
	}
	public void fetchAll() {
		List<Person> list = em.createQuery("from Person",Person.class).getResultList();
		for(Person p : list) {
			System.out.println(p);
		}
	}

}
