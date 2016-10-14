package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

import schoolExceptions.PersonException;

public class Student_Test {

	@BeforeClass
	public static void setup() throws PersonException {
		/*
		 * Add three Course records, add them to an ArrayList of Course
Add two Semesters, one for Fall, one for Spring.  Add them to an ArrayList of Semester
Add two Sections for each Course & Semester (total of six Sections).  Add them to an ArrayList of Section
Create ten Student records, add them to an ArrayList of Student.
		 */
		ArrayList classes = new ArrayList<Course>();
		ArrayList semesters = new ArrayList<Semester>();
		ArrayList sections = new ArrayList<Section>();



		ArrayList kidz = new ArrayList<Student>();
		kidz.add(new Student("Jane", "Doe", "Dough", new Date(90,1,1), eMajor.COMPSI,
				"Outer Space", "(444)-444-4444", "yooo@gmail.com"));
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}