package com.shiristi.overloading;

public class Student {
	String name;
	String department;
	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}
	void printDetails()
	{
		System.out.println("name="+name);
		System.out.println("department="+department);
	}
	String getGrades(int...marks)
	{
		int sum=0;
		for(int mark:marks)
		{
			sum=sum+mark;
		}
		return sum/2;
		
	}
}
