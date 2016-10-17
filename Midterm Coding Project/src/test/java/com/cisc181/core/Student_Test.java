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
	private static ArrayList<Enrollment> a;

	@SuppressWarnings("deprecation")
	@BeforeClass
	public static void setup() throws PersonException {

		kidz = new ArrayList<Student>();
		Collections.addAll(kidz,
				new Student("Jane", "Doe", "Dough", new Date(95, 1, 1), eMajor.COMPSI, "Outer Space", "(444)-444-4444",
						"yo@gmail.com"),
				new Student("Riquon", "Lobster", "Smith", new Date(95, 3, 3), eMajor.BUSINESS,
						"123 Congress Drive, the Mall, DC ", "(111)-111-1111", "yoo@gmail.com"),
				new Student("Sarah", "Elizabeth", "Lobster", new Date(95, 1, 1), eMajor.COMPSI, "Mercury",
						"(444)-444-4144", "yooo@gmail.com"),
				new Student("The", "Notorious", "BIG", new Date(95, 1, 1), eMajor.BUSINESS, "Venus", "(144)-444-4444",
						"yoooo@gmail.com"),
				new Student("What", "Ami", "Doing", new Date(95, 1, 1), eMajor.NURSING, "Earth", "(444)-414-4444",
						"yooooo@gmail.com"),
				new Student("Who", "Am", "I", new Date(95, 1, 1), eMajor.CHEM, "Mars", "(444)-454-4444",
						"yoooooo@gmail.com"),
				new Student("What", "Ismy", "Quest", new Date(95, 1, 1), eMajor.COMPSI, "Jupiter", "(444)-445-4444",
						"yooooooo@gmail.com"),
				new Student("John", "Stuart", "Lobster", new Date(95, 1, 1), eMajor.PHYSICS, "Saturn", "(444)-444-4445",
						"yoooooooo@gmail.com"),
				new Student("Em", "And", "Em", new Date(95, 1, 1), eMajor.NURSING, "Uranus", "(454)-444-4444",
						"yoooooooooo@gmail.com"),
				new Student("Marshall", "Philip", "Mathers", new Date(95, 1, 1), eMajor.CHEM, "Neptune",
						"(444)-444-4544", "yooooooooooo@gmail.com"));

		classes = new ArrayList<Course>();
		Collections.addAll(classes, new Course("Introduction to Underwater Basket Weaving", 4, eMajor.BUSINESS),
				new Course("Introduction to Potato Farming", 4, eMajor.PHYSICS),
				new Course("Advanced Crying", 4, eMajor.NURSING));

		semesters = new ArrayList<Semester>();
		semesters.add(new Semester(new Date(116, 8, 1), new Date(116, 11, 19))); // Fall
		semesters.add(new Semester(new Date(117, 1, 1), new Date(117, 4, 1))); // Spring

		sections = new ArrayList<Section>();
		Collections.addAll(sections, new Section(classes.get(0).getCourseID(), semesters.get(0).getSemesterID(), 101),
				new Section(classes.get(0).getCourseID(), semesters.get(1).getSemesterID(), 101),
				new Section(classes.get(1).getCourseID(), semesters.get(0).getSemesterID(), 102),
				new Section(classes.get(1).getCourseID(), semesters.get(1).getSemesterID(), 102),
				new Section(classes.get(2).getCourseID(), semesters.get(0).getSemesterID(), 103),
				new Section(classes.get(2).getCourseID(), semesters.get(0).getSemesterID(), 103));
	}

	@Test
	public void testEnrollandGPA() {
		// Enrolls kids, sets grades, checks gpa
		a = new ArrayList<Enrollment>();
		for (Student k : kidz) {
			for (Section s : sections) {
				a.add(new Enrollment(k.getStudentID(), s.getSectionID()));
			}
		}
		// student 0
		a.get(0).setGrade(4.0);
		a.get(1).setGrade(4.0);
		a.get(2).setGrade(3.7);
		a.get(3).setGrade(4.0);
		a.get(4).setGrade(4.0);
		a.get(5).setGrade(4.0);
		// student 1
		a.get(6).setGrade(3.0);
		a.get(7).setGrade(3.0);
		a.get(8).setGrade(3.0);
		a.get(9).setGrade(2.0);
		a.get(10).setGrade(4.0);
		a.get(11).setGrade(3.0);
		// student 2
		a.get(12).setGrade(4.0);
		a.get(13).setGrade(4.0);
		a.get(14).setGrade(4.0);
		a.get(15).setGrade(4.0);
		a.get(16).setGrade(4.0);
		a.get(17).setGrade(4.0);
		// student 3
		a.get(18).setGrade(3.0);
		a.get(19).setGrade(3.0);
		a.get(20).setGrade(3.0);
		a.get(21).setGrade(3.0);
		a.get(22).setGrade(3.0);
		a.get(23).setGrade(3.0);
		// student 4
		a.get(24).setGrade(2.0);
		a.get(25).setGrade(2.0);
		a.get(26).setGrade(2.0);
		a.get(27).setGrade(2.0);
		a.get(28).setGrade(2.0);
		a.get(29).setGrade(2.0);
		// student 5
		a.get(30).setGrade(1.0);
		a.get(31).setGrade(1.0);
		a.get(32).setGrade(1.0);
		a.get(33).setGrade(1.0);
		a.get(34).setGrade(1.0);
		a.get(35).setGrade(1.0);
		// student 6
		a.get(36).setGrade(4.0);
		a.get(37).setGrade(4.0);
		a.get(38).setGrade(4.0);
		a.get(39).setGrade(4.0);
		a.get(40).setGrade(4.0);
		a.get(41).setGrade(4.0);
		// student 7
		a.get(42).setGrade(4.0);
		a.get(43).setGrade(4.0);
		a.get(44).setGrade(4.0);
		a.get(45).setGrade(4.0);
		a.get(46).setGrade(4.0);
		a.get(47).setGrade(4.0);
		// student 8
		a.get(48).setGrade(4.0);
		a.get(49).setGrade(4.0);
		a.get(50).setGrade(4.0);
		a.get(51).setGrade(4.0);
		a.get(52).setGrade(4.0);
		a.get(53).setGrade(4.0);
		// student 9
		a.get(54).setGrade(4.0);
		a.get(55).setGrade(4.0);
		a.get(56).setGrade(4.0);
		a.get(57).setGrade(4.0);
		a.get(58).setGrade(4.0);
		a.get(59).setGrade(4.0);

		double grades = 0; double sum = 0;
		double grades1 = 0; double sum1 = 0;
		double grades2 = 0; double sum2 = 0;
		double grades3 = 0; double sum3 = 0;
		double grades4 = 0; double sum4 = 0;
		double grades5 = 0; double sum5 = 0;
		double grades6 = 0; double sum6 = 0;
		double grades7 = 0; double sum7 = 0;
		double grades8 = 0; double sum8 = 0;
		double grades9 = 0; double sum9 = 0;
		for (Enrollment enr : a) {
			if (enr.getStudentID() == kidz.get(0).getStudentID()) {
				grades += enr.getGrade();
				sum += 1;
			} else if (enr.getStudentID() == kidz.get(1).getStudentID()) {
				grades1 += enr.getGrade();
				sum1 += 1;
			} else if (enr.getStudentID() == kidz.get(2).getStudentID()) {
				grades2 += enr.getGrade();
				sum2 += 1;
			} else if (enr.getStudentID() == kidz.get(3).getStudentID()) {
				grades3 += enr.getGrade();
				sum3 += 1;
			} else if (enr.getStudentID() == kidz.get(4).getStudentID()) {
				grades4 += enr.getGrade();
				sum4 += 1;
			} else if (enr.getStudentID() == kidz.get(5).getStudentID()) {
				grades5 += enr.getGrade();
				sum5 += 1;
			} else if (enr.getStudentID() == kidz.get(6).getStudentID()) {
				grades6 += enr.getGrade();
				sum6 += 1;
			} else if (enr.getStudentID() == kidz.get(7).getStudentID()) {
				grades7 += enr.getGrade();
				sum7 += 1;
			} else if (enr.getStudentID() == kidz.get(8).getStudentID()) {
				grades8 += enr.getGrade();
				sum8 += 1;
			} else if (enr.getStudentID() == kidz.get(9).getStudentID()) {
				grades9 += enr.getGrade();
				sum9 += 1;
			}
		}
		double studentGPA = Math.round((grades / sum) * 100.0) / 100.0;
		assertTrue(studentGPA == 3.95);
		double studentGPA1 = Math.round((grades1 / sum1) * 100.0) / 100.0;
		assertTrue(studentGPA1 == 3.00);
		double studentGPA2 = Math.round((grades2 / sum2) * 100.0) / 100.0;
		assertTrue(studentGPA2 == 4.00);
		double studentGPA3 = Math.round((grades3 / sum3) * 100.0) / 100.0;
		assertTrue(studentGPA3 == 3.00);
		double studentGPA4 = Math.round((grades4 / sum4) * 100.0) / 100.0;
		assertTrue(studentGPA4 == 2.00);
		double studentGPA5 = Math.round((grades5 / sum5) * 100.0) / 100.0;
		assertTrue(studentGPA5 == 1.00);
		double studentGPA6 = Math.round((grades6 / sum6) * 100.0) / 100.0;
		assertTrue(studentGPA6 == 4.00);
		double studentGPA7 = Math.round((grades7 / sum7) * 100.0) / 100.0;
		assertTrue(studentGPA7 == 4.00);
		double studentGPA8 = Math.round((grades8 / sum8) * 100.0) / 100.0;
		assertTrue(studentGPA8 == 4.00);
		double studentGPA9 = Math.round((grades9 / sum9) * 100.0) / 100.0;
		assertTrue(studentGPA9 == 4.00);
	}

	@Test
	public void testCheckCourseAvg() {
		// checks avg grade for course
		double grades0 = 0; double sum0 = 0;
		double grades1 = 0; double sum1 = 0;
		double grades2 = 0; double sum2 = 0;
		for (Enrollment enr : a) {
			if (enr.getSectionID() == sections.get(0).getSectionID()
					|| enr.getSectionID() == sections.get(1).getSectionID()) {
				grades0 += enr.getGrade();
				sum0 += 1;
			} else if (enr.getSectionID() == sections.get(2).getSectionID()
					|| enr.getSectionID() == sections.get(3).getSectionID()) {
				grades1 += enr.getGrade();
				sum1 += 1;
			} else if (enr.getSectionID() == sections.get(4).getSectionID()
					|| enr.getSectionID() == sections.get(5).getSectionID()) {
				grades2 += enr.getGrade();
				sum2 += 1;
			}
		}
		double courseAvg0 = Math.round((grades0 / sum0) * 100.0) / 100.0;
		assertTrue(courseAvg0 == 3.30);
		double courseAvg1 = Math.round((grades1 / sum1) * 100.0) / 100.0;
		assertTrue(courseAvg1 == 3.24);
		double courseAvg2 = Math.round((grades2 / sum2) * 100.0) / 100.0;
		assertTrue(courseAvg2 == 3.35);
	}

	@Test
	public void testMajorChange() {
		// change majors of a kid
		assertTrue(kidz.get(0).getMajor() == eMajor.COMPSI.toString());
		kidz.get(0).setMajor(eMajor.BUSINESS);
		assertTrue(kidz.get(0).getMajor() == eMajor.BUSINESS.toString());
	}
}