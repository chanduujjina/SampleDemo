package com.demo.inheritance;

public class ContractEmployee extends BaseInfo{
	
	
	
    private String payRol;
	
	private String payRolCompanydetails;
	
	private String contractEndDate;
	
	private String employeeStatus; 
	
	public ContractEmployee(int employeeId, String employeeName, String gender, String address, String payRol,
			String payRolCompanydetails, String contractEndDate, String employeeStatus) {
		
		super(employeeId, employeeName, gender, address);
		
		this.payRol = payRol;
		this.payRolCompanydetails = payRolCompanydetails;
		this.contractEndDate = contractEndDate;
		this.employeeStatus = employeeStatus;
	}

	public String getPayRol() {
		return payRol;
	}

	public String getPayRolCompanydetails() {
		return payRolCompanydetails;
	}

	public String getContractEndDate() {
		return contractEndDate;
	}

	public String getEmployeeStatus() {
		return employeeStatus;
	}

	@Override
	public String toString() {
		return "ContractEmployee [payRol=" + payRol + ", payRolCompanydetails=" + payRolCompanydetails
				+ ", contractEndDate=" + contractEndDate + ", employeeStatus=" + employeeStatus + "]";
	}

	

}
