package com.demo.inheritance;


public class EmployeeInfo {
	
	//Permanent employee details
     PermanentEmployee permEmployee;
		
		
	//Contract employee details
	 ContractEmployee contractEmployee;


	public EmployeeInfo(PermanentEmployee permEmployee, ContractEmployee contractEmployee) {
		super();
		this.permEmployee = permEmployee;
		this.contractEmployee = contractEmployee;
	}


	
     
     public PermanentEmployee getPermEmployee() {
 		return permEmployee;
 	}


 	public ContractEmployee getContractEmployee() {
 		return contractEmployee;
 	}
 	
     
     @Override
 	public String toString() {
 		return "EmployeeInfo [permEmployee=" + permEmployee + ", contractEmployee=" + contractEmployee + "]";
 	}


	
	
	

}
