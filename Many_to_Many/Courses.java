package org.snad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Courses {
	@Id
	private int courseId;
	private String name;
	private int fee;
	
	Courses(){
		
	}
	
	public Courses(int courseId, String name, int fee) {
		this.courseId = courseId;
		this.name = name;
		this.fee = fee;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Courses [courseId=" + courseId + ", name=" + name + ", fee=" + fee + "]";
	}

}
