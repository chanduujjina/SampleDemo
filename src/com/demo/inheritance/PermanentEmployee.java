package com.demo.inheritance;

public class PermanentEmployee extends BaseInfo{
	
	

	private String bussinessUnit;

	private double salary;
	
	private String joiningDate;
	
	private String glomodetails;
	
	private int noOfLeaves;
	

	public PermanentEmployee(int employeeId, String employeeName, String gender, String address, String bussinessUnit,
			double salary, String joiningDate, String glomodetails, int noOfLeaves) {
		
		super(employeeId, employeeName, gender, address);
		this.bussinessUnit = bussinessUnit;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.glomodetails = glomodetails;
		this.noOfLeaves = noOfLeaves;
	}

	

	public String getBussinessUnit() {
		return bussinessUnit;
	}

	public double getSalary() {
		return salary;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public String getGlomodetails() {
		return glomodetails;
	}

	public int getNoOfLeaves() {
		return noOfLeaves;
	}
	
	@Override
	public String toString() {
		return "PermanentEmployee [bussinessUnit=" + bussinessUnit + ", salary=" + salary + ", joiningDate="
				+ joiningDate + ", glomodetails=" + glomodetails + ", noOfLeaves=" + noOfLeaves + "]";
	}
}
