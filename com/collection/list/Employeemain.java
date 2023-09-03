package com.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employeemain {

	public static void main(String[] args) {
		List<Employee> arraylist=Arrays.asList(
											new Employee("arun",8,"hyderabad"),
											new Employee("anjali",17,"banglore"),
											new Employee("nickel",7,"hyderabad"),
											new Employee("manay",20,"hyderabad"),
											new Employee("swapna",19,"mumbai"));
				
		for(Employee list:arraylist)
			System.out.println(list);
		System.out.println("---employees belongs to same city----");
		
		List<String> sameCity=new ArrayList<>();
		for(Employee emp:arraylist) {
			if(emp.getCity().equals("hyderabad")) {
				sameCity.add(emp.getName());
			}
		}
		for(String city:sameCity)
			System.out.println(city);
		
	}

}
