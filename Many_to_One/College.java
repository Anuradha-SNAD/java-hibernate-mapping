package org.snad;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {
	@Id
	private int collegeId;
	private String collegeName;
	private String location;
	
	College(){
				
	}
	public College(int collegeId, String collegeName, String location) {
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.location = location;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", location=" + location + "]";
	}
	
	

}
