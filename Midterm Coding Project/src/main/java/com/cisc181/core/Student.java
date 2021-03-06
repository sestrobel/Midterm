package com.cisc181.core;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

import schoolExceptions.PersonException;

public class Student extends Person {
	
	//Change Student.Major so it uses the eMajor enum (hint: change the attribute, getter, setter).  Add Major to Course as an attribute.  10 points.

	private eMajor Major; //
	private UUID StudentID;
	private double GradePoint;
	
	public String getMajor ( )
    {
        return this.Major.toString(); //
    }
    public void setMajor (eMajor Major) //
    {
        this.Major = Major;    
    }
    
    public UUID getStudentID(){
    	return this.StudentID;
    }
    
	public Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
			String Address, String Phone_number, String Email) throws PersonException //
	{
		super(FirstName, MiddleName, LastName, DOB, Address, Phone_number, Email);
		this.StudentID = UUID.randomUUID();
		this.Major = Major;
		
	}
	
	@Override
	public void PrintName() {
		System.out.println(getLastName() + ","  + getFirstName() + ' ' + getMiddleName());
	}

	public void PrintName(boolean bnormal)
	{
		super.PrintName();
	}
	
}