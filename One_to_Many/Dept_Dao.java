package org.snad.uni;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Dept_Dao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public void save(Department department) {
		et.begin();
		em.persist(department);
		et.commit();
		System.out.println("Saved Successful");
	}
	public void delete(int dept_id,int id) {
		Employees employee = em.find(Employees.class, id);
		Department department = em.find(Department.class, dept_id);
		if(employee != null) {
			et.begin();
			department.getEmployees().remove(employee);
			et.commit();
			System.out.println("Employee Deleted...");
		}else {
			System.out.println("employee not found");
		}
		
	}
	public void deleteDept(int id) {
		 Department department = em.find(Department.class, id);
		 if(department != null) {
				et.begin();
				em.remove(department);
				et.commit();
				System.out.println("department Deleted...");
			}else {
				System.out.println("department not found");
			}
	}
	public void fetch(int id) {
		Department department = em.find(Department.class, id);
		if(department != null) {
			System.out.println(department);;
		}else {
			System.out.println("department not found");
		}
		
	}
	public void fetchAll() {
		List<Department> list = em.createQuery("from Department",Department.class).getResultList();
		for(Department d : list) {
			System.out.println(d);
		}
	}

}
