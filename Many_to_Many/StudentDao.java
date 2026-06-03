package org.snad;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void save(List<Student> student) {
		et.begin();
		for(Student s : student) {
			em.persist(s);
		}
		et.commit();
		System.out.println("Saved Successfully...");
	}
	public void fetch(int id) {
		Student student = em.find(Student.class, id);
		if(student != null) {
			System.out.println(student);
		}else {
			System.out.println("Student Id Not found");
		}
	}
	public void fetchAll() {
		List<Student> student=em.createQuery("from Student",Student.class).getResultList();
//		for(Student s : student) {
//			System.out.println(s);
//		}
		student.forEach(System.out::println);
		
	}
	public void delete(int id) {
		Student student = em.find(Student.class, id);
		if(student != null) {
			et.begin();
			em.remove(student);
			et.commit();
			System.out.println("deleted...");
		}else {
			System.out.println("Student Id Not found");
		}
	}

}
