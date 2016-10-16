package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	UUID SectionID;
	UUID StudentID;
	UUID EnrollmentID;
	double Grade;
	
	private Enrollment() {}
	
	public Enrollment(UUID StudentID, UUID SectionID) {
		EnrollmentID = UUID.randomUUID();
		this.StudentID = StudentID;
		this.SectionID = SectionID;
	}
	
	
	public UUID getSectionID() {
		return SectionID;
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}
	


}
