package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

	UUID SectionID;
	UUID StudentID;
	UUID EnrollmentID;
	double Grade;
	
	private Enrollment() {}
	
	Enrollment(UUID StudentID, UUID SectionID) {
		EnrollmentID = UUID.randomUUID();
		this.StudentID = StudentID;
		this.SectionID = SectionID;
	}
	
	void SetGrade(double grade) {
		this.Grade = grade;
	}

}
