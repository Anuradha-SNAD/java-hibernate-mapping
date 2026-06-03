package org.snad.uni;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@Column(name="Department_Id")
	private int id;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Employees> employees;

	public Department(int id, String name, List<Employees> employees) {
		this.id = id;
		this.name = name;
		this.employees = employees;
	}
	Department(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", employees=" + employees + "]";
	}
	

}
