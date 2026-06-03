package org.snad.uni;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employees {
	@Id
	@Column(name="Employee_Id")
	private int id;
	private String name;
	
	Employees(){
		
	}
	public Employees(int id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
