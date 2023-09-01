package com.shiristi.overloading;

public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student("vishal", "manager",8);
		student.printDetails();
		System.out.println("The secured grade is"+student.getGrades(40,60,80));
		System.out.println();
		
		Student student2 = new Student("jenny", "director",6);
		student2.printDetails();
		System.out.println("The secured grade is "+student2.getGrades(60,90,45));
	}

}
