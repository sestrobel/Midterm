package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import com.cisc181.core.Staff;
import com.cisc181.eNums.eTitle;

import schoolExceptions.PersonException;

public class Staff_Test {
	
	@Test
	public void Salary_Test() throws PersonException {
		ArrayList<Staff> staffList = new ArrayList<Staff>();
		staffList.add(new Staff("Jane", "Doe", "Dough",
			new Date(90,1,1), "123 Cherry Ln, Orchards, Jupiter", "(444)-444-4444", "abc@gmail.com",
			"never i don't like office hours", 2, 20000.00, new Date(110,1,1),
			eTitle.MS));
		staffList.add(new Staff("Riquon", "Lobster", "Smith",
				new Date(90,3,3), "123 Congress Drive, the Mall, DC ", "(111)-111-1111", "def@gmail.com",
				"Monday 1-2pm", 2, 22000.00, new Date(110,3,3),
				eTitle.MR));
		staffList.add(new Staff("Sarah", "Elizabeth", "Lobster",
				new Date(90,2,2), "Outer Space", "(555)-555-5555", "ghi@gmail.com",
				"Monday 1-2am", 2, 24000.00, new Date(105,2,2),
				eTitle.MS));
		staffList.add(new Staff("Rashiqah", "Bab", "Sayeed",
				new Date(90,2,2), "Neverland", "(666)-555-5655", "jkl@gmail.com",
				"Friday 8-9pm", 2, 26000.00, new Date(115,2,2),
				eTitle.MS));
		staffList.add(new Staff("John", "Stuart", "Lobster",
				new Date(90,2,2), "Where do we really come from anyways", "(444)-255-5555", "mno@gmail.com",
				"Tuesday 4-5pm", 2, 28000.00, new Date(102,2,2),
				eTitle.MR));
		double sum = 0;
		double humans = 0;
		for (Staff staffer : staffList) {
			sum += staffer.getSalary();
			humans += 1;
		}
		double avg = sum/humans;
		assertTrue(avg == 24000.00);
	}	
	
	@Test(expected=PersonException.class)
	public void Phone_Test() throws PersonException{
		Staff staffer = new Staff("Jane", "Doe", "Lobster",
			new Date(90,1,1), "123 Congress Drive, Atlanta, GA", "(444)444444", "abc@gmail.com",
			"Monday 4-5am", 2, 20000.00, new Date(110,1,1),
			eTitle.MS);
		staffer.getPhone();
	}
	
	@Test(expected=PersonException.class)
	public void DOB_Test() throws Exception{
		Staff staffer = new Staff("Jane", "Doe", "Lobster",
			new Date(16,1,1), "123 Congress Drive, Atlanta, GA", "(444)-444-4444", "abc@gmail.com",
			"Monday 4-5am", 2, 20000.00, new Date(90,1,1),
			eTitle.MS);
		System.out.println(staffer.getDOB());
	}
}
