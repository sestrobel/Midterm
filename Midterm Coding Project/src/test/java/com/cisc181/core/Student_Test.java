package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

import schoolExceptions.PersonException;

public class Student_Test {
	private static ArrayList<Student> kidz;
	private static ArrayList<Course> classes;
	private static ArrayList<Semester> semesters;
	private static ArrayList<Section> sections;

	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void setup() throws PersonException {

		kidz = new ArrayList<Student>();
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
		kidz.add(new Student("John", "Stuart", "Lobster", new Date(95, 1, 1), eMajor.PHYSICS, "Saturn",
				"(444)-444-4445", "yoooooooo@gmail.com"));
		kidz.add(new Student("Em", "And", "Em", new Date(95, 1, 1), eMajor.NURSING, "Uranus", "(454)-444-4444",
				"yoooooooooo@gmail.com"));
		kidz.add(new Student("Marshall", "Philip", "Mathers", new Date(95, 1, 1), eMajor.CHEM, "Neptune",
				"(444)-444-4544", "yooooooooooo@gmail.com"));

		classes = new ArrayList<Course>();
		classes.add(new Course("Introduction to Underwater Basket Weaving", 4, eMajor.BUSINESS));
		classes.add(new Course("Introduction to Potato Farming", 4, eMajor.PHYSICS));
		classes.add(new Course("Advanced Crying", 4, eMajor.NURSING));

		semesters = new ArrayList<Semester>();
		// Fall
		semesters.add(new Semester(new Date(116, 8, 1), new Date(116, 11, 19)));
		// Spring
		semesters.add(new Semester(new Date(117, 1, 1), new Date(117, 4, 1)));

		sections = new ArrayList<Section>();
		sections.add(new Section(classes.get(0).getCourseID(), semesters.get(0).getSemesterID(), 101));
		sections.add(new Section(classes.get(0).getCourseID(), semesters.get(1).getSemesterID(), 101));
		sections.add(new Section(classes.get(1).getCourseID(), semesters.get(0).getSemesterID(), 102));
		sections.add(new Section(classes.get(1).getCourseID(), semesters.get(1).getSemesterID(), 102));
		sections.add(new Section(classes.get(2).getCourseID(), semesters.get(0).getSemesterID(), 103));
		sections.add(new Section(classes.get(2).getCourseID(), semesters.get(0).getSemesterID(), 103));

	}

	/*

	 * Change the major of one of the Student records.
	 * 
	 * 5 points.
	 * 
	 */
	@Test
	public void test() {
		//Enrolls kids, sets grades, checks gpa
		assertEquals(1, 1);
		ArrayList<Enrollment> a = new ArrayList<Enrollment>();
		Collections.addAll(a, new Enrollment(kidz.get(0).getStudentID(), sections.get(0).getSectionID()),
				new Enrollment(kidz.get(0).getStudentID(), sections.get(1).getSectionID()), 
				new Enrollment(kidz.get(0).getStudentID(), sections.get(2).getSectionID()),
				new Enrollment(kidz.get(0).getStudentID(), sections.get(3).getSectionID()),
				new Enrollment(kidz.get(0).getStudentID(), sections.get(4).getSectionID()),
				new Enrollment(kidz.get(0).getStudentID(), sections.get(5).getSectionID()));
		kidz.get(0).setEnrollments(a);
		kidz.get(0).getEnrollments().get(0).setGrade(4.0);
		kidz.get(0).getEnrollments().get(1).setGrade(4.0);
		kidz.get(0).getEnrollments().get(2).setGrade(3.7);
		kidz.get(0).getEnrollments().get(3).setGrade(4.0);
		kidz.get(0).getEnrollments().get(4).setGrade(4.0);
		kidz.get(0).getEnrollments().get(5).setGrade(4.0);
		assertTrue(kidz.get(0).gradePointCalc() == 3.95);
		
		ArrayList<Enrollment> b = new ArrayList<Enrollment>();
		Collections.addAll(b, new Enrollment(kidz.get(1).getStudentID(), sections.get(0).getSectionID()),
				new Enrollment(kidz.get(1).getStudentID(), sections.get(1).getSectionID()), 
				new Enrollment(kidz.get(1).getStudentID(), sections.get(2).getSectionID()),
				new Enrollment(kidz.get(1).getStudentID(), sections.get(3).getSectionID()),
				new Enrollment(kidz.get(1).getStudentID(), sections.get(4).getSectionID()),
				new Enrollment(kidz.get(1).getStudentID(), sections.get(5).getSectionID()));
		kidz.get(1).setEnrollments(b);
		kidz.get(1).getEnrollments().get(0).setGrade(3.0);
		kidz.get(1).getEnrollments().get(1).setGrade(3.0);
		kidz.get(1).getEnrollments().get(2).setGrade(3.0);
		kidz.get(1).getEnrollments().get(3).setGrade(2.0);
		kidz.get(1).getEnrollments().get(4).setGrade(4.0);
		kidz.get(1).getEnrollments().get(5).setGrade(3.0);
		assertTrue(kidz.get(1).gradePointCalc() == 3.00);
		
		ArrayList<Enrollment> c = new ArrayList<Enrollment>();
		Collections.addAll(c, new Enrollment(kidz.get(2).getStudentID(), sections.get(0).getSectionID()),
				new Enrollment(kidz.get(2).getStudentID(), sections.get(1).getSectionID()), 
				new Enrollment(kidz.get(2).getStudentID(), sections.get(2).getSectionID()),
				new Enrollment(kidz.get(2).getStudentID(), sections.get(3).getSectionID()),
				new Enrollment(kidz.get(2).getStudentID(), sections.get(4).getSectionID()),
				new Enrollment(kidz.get(2).getStudentID(), sections.get(5).getSectionID()));
		kidz.get(2).setEnrollments(c);
		kidz.get(2).getEnrollments().get(0).setGrade(4.0);
		kidz.get(2).getEnrollments().get(1).setGrade(4.0);
		kidz.get(2).getEnrollments().get(2).setGrade(4.0);
		kidz.get(2).getEnrollments().get(3).setGrade(4.0);
		kidz.get(2).getEnrollments().get(4).setGrade(4.0);
		kidz.get(2).getEnrollments().get(5).setGrade(4.0);
		assertTrue(kidz.get(2).gradePointCalc() == 4.00);

		
		ArrayList<Enrollment> d = new ArrayList<Enrollment>();
		Collections.addAll(d, new Enrollment(kidz.get(3).getStudentID(), sections.get(0).getSectionID()),
				new Enrollment(kidz.get(3).getStudentID(), sections.get(1).getSectionID()), 
				new Enrollment(kidz.get(3).getStudentID(), sections.get(2).getSectionID()),
				new Enrollment(kidz.get(3).getStudentID(), sections.get(3).getSectionID()),
				new Enrollment(kidz.get(3).getStudentID(), sections.get(4).getSectionID()),
				new Enrollment(kidz.get(3).getStudentID(), sections.get(5).getSectionID()));
		kidz.get(3).setEnrollments(d);
		kidz.get(3).getEnrollments().get(0).setGrade(3.0);
		kidz.get(3).getEnrollments().get(1).setGrade(3.0);
		kidz.get(3).getEnrollments().get(2).setGrade(3.0);
		kidz.get(3).getEnrollments().get(3).setGrade(3.0);
		kidz.get(3).getEnrollments().get(4).setGrade(3.0);
		kidz.get(3).getEnrollments().get(5).setGrade(3.0);
		assertTrue(kidz.get(3).gradePointCalc() == 3.00);
		
		ArrayList<Enrollment> e = new ArrayList<Enrollment>();
		Collections.addAll(e, new Enrollment(kidz.get(4).getStudentID(), sections.get(0).getSectionID()),
				new Enrollment(kidz.get(4).getStudentID(), sections.get(1).getSectionID()), 
				new Enrollment(kidz.get(4).getStudentID(), sections.get(2).getSectionID()),
				new Enrollment(kidz.get(4).getStudentID(), sections.get(3).getSectionID()),
				new Enrollment(kidz.get(4).getStudentID(), sections.get(4).getSectionID()),
				new Enrollment(kidz.get(4).getStudentID(), sections.get(5).getSectionID()));
		kidz.get(4).setEnrollments(e);
		kidz.get(4).getEnrollments().get(0).setGrade(2.0);
		kidz.get(4).getEnrollments().get(1).setGrade(2.0);
		kidz.get(4).getEnrollments().get(2).setGrade(2.0);
		kidz.get(4).getEnrollments().get(3).setGrade(2.0);
		kidz.get(4).getEnrollments().get(4).setGrade(2.0);
		kidz.get(4).getEnrollments().get(5).setGrade(2.0);
		assertTrue(kidz.get(4).gradePointCalc() == 2.00);
		
		ArrayList<Enrollment> f = new ArrayList<Enrollment>();
		Collections.addAll(f, new Enrollment(kidz.get(5).getStudentID(), sections.get(0).getSectionID()),
				new Enrollment(kidz.get(5).getStudentID(), sections.get(1).getSectionID()), 
				new Enrollment(kidz.get(5).getStudentID(), sections.get(2).getSectionID()),
				new Enrollment(kidz.get(5).getStudentID(), sections.get(3).getSectionID()),
				new Enrollment(kidz.get(5).getStudentID(), sections.get(4).getSectionID()),
				new Enrollment(kidz.get(5).getStudentID(), sections.get(5).getSectionID()));
		kidz.get(5).setEnrollments(f);
		kidz.get(5).getEnrollments().get(0).setGrade(1.0);
		kidz.get(5).getEnrollments().get(1).setGrade(1.0);
		kidz.get(5).getEnrollments().get(2).setGrade(1.0);
		kidz.get(5).getEnrollments().get(3).setGrade(1.0);
		kidz.get(5).getEnrollments().get(4).setGrade(1.0);
		kidz.get(5).getEnrollments().get(5).setGrade(1.0);
		assertTrue(kidz.get(5).gradePointCalc() == 1.00);
		
		ArrayList<Enrollment> g = new ArrayList<Enrollment>();
		Collections.addAll(g, new Enrollment(kidz.get(6).getStudentID(), sections.get(0).getSectionID()),
				new Enrollment(kidz.get(6).getStudentID(), sections.get(1).getSectionID()), 
				new Enrollment(kidz.get(6).getStudentID(), sections.get(2).getSectionID()),
				new Enrollment(kidz.get(6).getStudentID(), sections.get(3).getSectionID()),
				new Enrollment(kidz.get(6).getStudentID(), sections.get(4).getSectionID()),
				new Enrollment(kidz.get(6).getStudentID(), sections.get(5).getSectionID()));
		kidz.get(6).setEnrollments(g);
		kidz.get(6).getEnrollments().get(0).setGrade(4.0);
		kidz.get(6).getEnrollments().get(1).setGrade(4.0);
		kidz.get(6).getEnrollments().get(2).setGrade(4.0);
		kidz.get(6).getEnrollments().get(3).setGrade(4.0);
		kidz.get(6).getEnrollments().get(4).setGrade(4.0);
		kidz.get(6).getEnrollments().get(5).setGrade(4.0);
		assertTrue(kidz.get(6).gradePointCalc() == 4.00);
		
		ArrayList<Enrollment> h = new ArrayList<Enrollment>();
		Collections.addAll(h, new Enrollment(kidz.get(7).getStudentID(), sections.get(0).getSectionID()),
				new Enrollment(kidz.get(7).getStudentID(), sections.get(1).getSectionID()), 
				new Enrollment(kidz.get(7).getStudentID(), sections.get(2).getSectionID()),
				new Enrollment(kidz.get(7).getStudentID(), sections.get(3).getSectionID()),
				new Enrollment(kidz.get(7).getStudentID(), sections.get(4).getSectionID()),
				new Enrollment(kidz.get(7).getStudentID(), sections.get(5).getSectionID()));
		kidz.get(7).setEnrollments(h);
		kidz.get(7).getEnrollments().get(0).setGrade(4.0);
		kidz.get(7).getEnrollments().get(1).setGrade(4.0);
		kidz.get(7).getEnrollments().get(2).setGrade(4.0);
		kidz.get(7).getEnrollments().get(3).setGrade(4.0);
		kidz.get(7).getEnrollments().get(4).setGrade(4.0);
		kidz.get(7).getEnrollments().get(5).setGrade(4.0);
		assertTrue(kidz.get(7).gradePointCalc() == 4.00);
		
		ArrayList<Enrollment> i = new ArrayList<Enrollment>();
		Collections.addAll(i, new Enrollment(kidz.get(8).getStudentID(), sections.get(0).getSectionID()),
				new Enrollment(kidz.get(8).getStudentID(), sections.get(1).getSectionID()), 
				new Enrollment(kidz.get(8).getStudentID(), sections.get(2).getSectionID()),
				new Enrollment(kidz.get(8).getStudentID(), sections.get(3).getSectionID()),
				new Enrollment(kidz.get(8).getStudentID(), sections.get(4).getSectionID()),
				new Enrollment(kidz.get(8).getStudentID(), sections.get(5).getSectionID()));
		kidz.get(8).setEnrollments(i);
		kidz.get(8).getEnrollments().get(0).setGrade(4.0);
		kidz.get(8).getEnrollments().get(1).setGrade(4.0);
		kidz.get(8).getEnrollments().get(2).setGrade(4.0);
		kidz.get(8).getEnrollments().get(3).setGrade(4.0);
		kidz.get(8).getEnrollments().get(4).setGrade(4.0);
		kidz.get(8).getEnrollments().get(5).setGrade(4.0);
		assertTrue(kidz.get(8).gradePointCalc() == 4.00);
		
		ArrayList<Enrollment> j = new ArrayList<Enrollment>();
		Collections.addAll(j, new Enrollment(kidz.get(9).getStudentID(), sections.get(0).getSectionID()),
				new Enrollment(kidz.get(9).getStudentID(), sections.get(1).getSectionID()), 
				new Enrollment(kidz.get(9).getStudentID(), sections.get(2).getSectionID()),
				new Enrollment(kidz.get(9).getStudentID(), sections.get(3).getSectionID()),
				new Enrollment(kidz.get(9).getStudentID(), sections.get(4).getSectionID()),
				new Enrollment(kidz.get(9).getStudentID(), sections.get(5).getSectionID()));
		kidz.get(9).setEnrollments(j);
		kidz.get(9).getEnrollments().get(0).setGrade(4.0);
		kidz.get(9).getEnrollments().get(1).setGrade(4.0);
		kidz.get(9).getEnrollments().get(2).setGrade(4.0);
		kidz.get(9).getEnrollments().get(3).setGrade(4.0);
		kidz.get(9).getEnrollments().get(4).setGrade(4.0);
		kidz.get(9).getEnrollments().get(5).setGrade(4.0);
		assertTrue(kidz.get(9).gradePointCalc() == 4.00);
	}
	
	
	@Test
	public void test1() {
		//checks avg grade for course
		double grades0 = 0;
		double sum0 = 0;
		for (Student k : kidz) {
			for (Enrollment enr : k.getEnrollments()) {
				if (enr.getSectionID() == sections.get(0).getSectionID() || enr.getSectionID() == sections.get(1).getSectionID()) {
					grades0 += enr.getGrade();
					sum0 += 1;
				}
			}
		}
		double courseAvg0 = Math.round((grades0/sum0) * 100.0) / 100.0;
		System.out.println(courseAvg0);
		assertTrue(courseAvg0 == 3.30);
		
		double grades1 = 0;
		double sum1 = 0;
		for (Student k : kidz) {
			for (Enrollment enr : k.getEnrollments()) {
				if (enr.getSectionID() == sections.get(2).getSectionID() || enr.getSectionID() == sections.get(3).getSectionID()) {
					grades1 += enr.getGrade();
					sum1 += 1;
				}
			}
		}
		double courseAvg1 = Math.round((grades1/sum1) * 100.0) / 100.0;
		System.out.println(courseAvg1);
		assertTrue(courseAvg1 == 3.24);
		
		double grades2 = 0;
		double sum2 = 0;
		for (Student k : kidz) {
			for (Enrollment enr : k.getEnrollments()) {
				if (enr.getSectionID() == sections.get(4).getSectionID() || enr.getSectionID() == sections.get(5).getSectionID()) {
					grades2 += enr.getGrade();
					sum2 += 1;
				}
			}
		}
		double courseAvg2 = Math.round((grades2/sum2) * 100.0) / 100.0;
		System.out.println(courseAvg2);
		assertTrue(courseAvg2 == 3.35);
	}
	
	@Test
	public void test2() {
		//change majors of a kid
		assertTrue(kidz.get(0).getMajor() == eMajor.COMPSI.toString());
		kidz.get(0).setMajor(eMajor.BUSINESS);
		assertTrue(kidz.get(0).getMajor() == eMajor.BUSINESS.toString());

	}
}