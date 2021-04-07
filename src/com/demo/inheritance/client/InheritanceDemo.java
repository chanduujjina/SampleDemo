package com.demo.inheritance.client;

import com.demo.inheritance.BaseInfo;
import com.demo.inheritance.ContractEmployee;
import com.demo.inheritance.EmployeeInfo;
import com.demo.inheritance.PermanentEmployee;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		BaseInfo info = BaseInfo.builder().employeeId(1).employeeName("Akshara").address("hyd").gender("female").build();
		
		PermanentEmployee permanentEmployee = new PermanentEmployee(info, "RCLADM", 1000000l, "01JAN2021", "Visa approved for US", 5);
		
		BaseInfo info1 = BaseInfo.builder().employeeId(2).employeeName("Sai").address("hyd").gender("male").build();
		
		ContractEmployee contractEmployee = new ContractEmployee(info1, "IBM", "IBM Hyderabad", "01JAN2022", "activeStatus");
		
		
		EmployeeInfo employeeInfo = new EmployeeInfo(permanentEmployee, contractEmployee);
		
		
		System.out.println(employeeInfo.getContractEmployee().getEmployeeName());
		
		System.out.println(employeeInfo.getPermEmployee().getEmployeeName());

	}

}
