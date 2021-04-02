package com.demo.inheritance.client;

import com.demo.inheritance.ContractEmployee;
import com.demo.inheritance.EmployeeInfo;
import com.demo.inheritance.PermanentEmployee;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		PermanentEmployee permEmployee = new PermanentEmployee(1, "Akshara", "female", "hyd", "RCLADM", 1000000l, "01JAN2021", "Visa approved for US", 5);
		
		ContractEmployee contractEmployee = new ContractEmployee(1, "Sai", "male", "hyd", "IBM", "IBM Hyderabad", "01JAN2022", "activeStatus");
		
		EmployeeInfo empInfo = new EmployeeInfo(permEmployee, contractEmployee);
		
		System.out.println(empInfo.getContractEmployee().getEmployeeName());
		
		System.out.println(empInfo.getPermEmployee().getEmployeeName());

	}

}
