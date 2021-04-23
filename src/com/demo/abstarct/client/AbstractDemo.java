package com.demo.abstarct.client;

import com.demo.abstarct.Att;
import com.demo.abstarct.Plan;
import com.demo.abstarct.Verizon;

public class AbstractDemo {

	public static void main(String[] args) {
		Plan attplan = Plan.builder().planId(1).planName("special").planeDetails("unlimited calls and 3gb data in a day").expiryDate("11 Match 2019").build();
		
		Att att = new Att(1,"att", attplan);
		
		System.out.println(att);
		System.out.println(att.getSimSize());
		System.out.println(att.isPortable());
		//print planList
		System.out.println(att.getPlan());
		
		//return Plan.builder().planId(2).planName("regular").planeDetails("4 gb data unlimted calls").build();
		
		//verizon 
	
		Plan verizonplan = Plan.builder().planId(2).planName("regular").planeDetails("4 gb data unlimted calls").expiryDate("12 Mrach 2019").build();
		
		Verizon verizon = new Verizon(2, "verizon", verizonplan);
		
		System.out.println(verizon);
		System.out.println(verizon.getSimSize());
		System.out.println(verizon.isPortable());
		//print planList
		System.out.println(verizon.getPlan());

	}

}
