package org.snad;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Students_Dao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void save(List<Students> list) {
		et.begin();
		for(Students s : list) {
			em.persist(s);
		}
		et.commit();
		System.out.println("successfully saved...");
	}
	public void fetch(int id) {
		College college = em.find(College.class, id);
		if(college != null) {
			System.out.println(college);
		}else {
			System.out.println("college if not found");
		}
	}
	public void fetchStudent(int id) {
		Students student = em.find(Students.class, id);
		if(student != null) {
			System.out.println(student);
		}else {
			System.out.println("student if not found");
		}
	}
	public void fetchAll() {
		List<Students> list = em.createQuery("from Students",Students.class).getResultList();
		System.out.println(list);
	}

}
