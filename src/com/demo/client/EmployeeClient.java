package com.demo.client;

import com.demo.Employee;

public class EmployeeClient {

	public static void main(String[] args) {

		// create an employee 1 object

		/*
		 * Employee emp1 = new Employee(); emp1.setId(1); emp1.setName("chandu");
		 * emp1.setSalary(100000); emp1.setGender("male");
		 * 
		 * System.out.println(emp1);
		 * 
		 * 
		 * Employee emp2 = new Employee(); emp2.setId(2); emp2.setName("Akshara");
		 * emp2.setSalary(500000); emp2.setGender("female");
		 * 
		 * System.out.println(emp2);
		 */

		// String name="test";

		// String gender_male= "male";

		// String gender_female= "female";

		// double salary= 100000;

		/*
		 * for(int i=1;i<=10;i++) { //System.out.println("create object start");
		 * Employee emp = new Employee(); emp.setId(i); emp.setName(name+i); String
		 * gender = i<6 ? gender_male:gender_female; emp.setGender(gender);
		 * emp.setSalary(salary);
		 * 
		 * System.out.println(emp);
		 * 
		 * //System.out.println("end");
		 * 
		 * 
		 * }
		 */

		// Employee employee = new Employee(1,"Akshara",100000);

		// System.out.println(employee);

		Employee employee1 = new Employee(2, "chandu");

		System.out.println(employee1);

		Employee employee2 = new Employee(2, "chandu", 100000, "male");
		
		//System.out.println(employee2.hashCode());

		Employee employee3 = new Employee(2, "chandu", 100000, "male");
		//System.out.println(employee3.hashCode());
		
		Employee employee4 = new Employee(2, "chandu", 100000, "male","it");
		
		Employee employee5 = new Employee(2, "chandu", 100000, "male","it");
		
		System.out.println(employee4.hashCode());
		System.out.println(employee5.hashCode());
		
		boolean isEqual= employee4.equals(employee5);
		System.out.println(isEqual);

		System.out.println(employee2);
		
		

	}

}
