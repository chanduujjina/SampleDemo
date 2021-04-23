package com.demo.polymorphism;

public class RuntimePolyDemo {
	
	public static void main(String[] args)  {
		//first way
		
		Parent parent = new Child1();
		
		System.out.println(parent.getAssetDetails());
		
		parent.m1();
		
		System.out.println("-----------------------------------");
		
		Parent parent1 = new Child2();
		
		System.out.println(parent1.getAssetDetails());
		
	}
	

	
	
	
	

}
