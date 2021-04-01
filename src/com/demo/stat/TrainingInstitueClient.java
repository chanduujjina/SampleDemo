package com.demo.stat;

public class TrainingInstitueClient {

	public static void main(String[] args) {
		
		
		//Form1
		
		//header
		System.out.println(TrainingInstitue.instituteInfo);
		
		//body start
		TrainingInstitue institue1 = new TrainingInstitue(1, "Sai", "ECE", "2012") ;
		System.out.println(institue1);
		//body end
		
		//Footer
		System.out.println(TrainingInstitue.address);
		
System.out.println("-------------------------------------------------------------------------");	
		//Form2
		
		//header
				System.out.println(TrainingInstitue.instituteInfo);
				
				//body start
				TrainingInstitue institue2 = new TrainingInstitue(2, "Bharath", "ECE", "2012") ;
				System.out.println(institue2);
				//body end
				
				//Footer
				System.out.println(TrainingInstitue.address);
		

	}
	


}
