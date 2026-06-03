package org.snad;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Students {
	@Id
	private int studentId;
	private String studentName;
	@ManyToOne(cascade = CascadeType.ALL)
	private College college;
	
	Students(){
		
	}

	public Students(int studentId, String studentName, College college) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.college = college;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Students [studentId=" + studentId + ", studentName=" + studentName + ", college=" + college + "]";
	}
	

}
