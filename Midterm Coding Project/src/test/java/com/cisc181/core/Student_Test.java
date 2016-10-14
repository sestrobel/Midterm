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

	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void setup() throws PersonException {
		/*
		 * Add three Course records, add them to an ArrayList of Course Add two
		 * Semesters, one for Fall, one for Spring. Add them to an ArrayList of
		 * Semester Add two Sections for each Course & Semester (total of six
		 * Sections). Add them to an ArrayList of Section Create ten Student
		 * records, add them to an ArrayList of Student.
		 */
		ArrayList<Course> classes = new ArrayList<Course>();
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		ArrayList<Section> sections = new ArrayList<Section>();

		ArrayList<Student> kidz = new ArrayList<Student>();
		kidz.add(new Student("Jane", "Doe", "Dough", new Date(95, 1, 1), eMajor.COMPSI, "Outer Space", "(444)-444-4444",
				"yo@gmail.com"));
		kidz.add(new Student("Riquon", "Lobster", "Smith", new Date(95, 3, 3), eMajor.BUSINESS,
				"123 Congress Drive, the Mall, DC ", "(111)-111-1111", "yoo@gmail.com"));
		kidz.add(new Student("Sarah", "Elizabeth", "Lobster", new Date(95, 1, 1), eMajor.COMPSI, "Mercury",
				"(444)-444-4144", "yooo@gmail.com"));
		kidz.add(new Student("The", "Notorious", "BIG", new Date(95, 1, 1), eMajor.BUSINESS, "Venus", "(144)-444-4444",
				"yoooo@gmail.com"));
		kidz.add(new Student("What", "Ami", "Doing", new Date(95, 1, 1), eMajor.NURSING, "Earth", "(444)-414-4444",
				"yooooo@gmail.com"));
		kidz.add(new Student("Who", "Am", "I", new Date(95, 1, 1), eMajor.CHEM, "Mars", "(444)-454-4444",
				"yoooooo@gmail.com"));
		kidz.add(new Student("What", "Ismy", "Quest", new Date(95, 1, 1), eMajor.COMPSI, "Jupiter", "(444)-445-4444",
				"yooooooo@gmail.com"));
		kidz.add(new Student("John", "Stuart", "Lobster", new Date(95, 1, 1), eMajor.PHYSICS, "Saturn", "(444)-444-4445",
				"yoooooooo@gmail.com"));
		kidz.add(new Student("Em", "And", "Em", new Date(95, 1, 1), eMajor.NURSING, "Uranus", "(454)-444-4444",
				"yoooooooooo@gmail.com"));
		kidz.add(new Student("Marshall", "Philip", "Mathers", new Date(95, 1, 1), eMajor.CHEM, "Neptune", "(444)-444-4544",
				"yooooooooooo@gmail.com"));
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}