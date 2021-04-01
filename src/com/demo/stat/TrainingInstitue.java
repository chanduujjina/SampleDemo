package com.demo.stat;

public class TrainingInstitue {
	
	
	


	@Override
	public String toString() {
		return "TrainingInstitue [studentId=" + studentId + ", name=" + name + ", branch=" + branch + ", passedout="
				+ passedout + "]";
	}

	public static String instituteInfo ="statrted in 1998 and placed so many students in MNC companys";
	
	public static String address = "Ameerpet Hyd";
	
	
	
	private int studentId;
	
	private String name;
	
	private String branch;
	
	private String passedout;
	
	 
	


	public TrainingInstitue(int studentId, String name, String branch, String passedout) {
		this.studentId = studentId;
		this.name = name;
		this.branch = branch;
		this.passedout = passedout;
	}
	


	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public String getBranch() {
		return branch;
	}

	public String getPassedout() {
		return passedout;
	}

	
	


}
