package com.demo.polymorphism;

public class RuntimePolyDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		//first way
		
		Parent parent = new Child1();
		
		//System.out.println(parent.getAssetDetails());
		
		//parent.m1();
		
		System.out.println("-----------------------------------");
		
		Parent parent1 = new Child2();
		
		//System.out.println(parent1.getAssetDetails());
		//Parent parent2 = new Child2();
		Parent parent2 = getInstance("com.demo.polymorphism.Child2");
		
		System.out.println(parent2.getAssetDetails());
	}
	
	private static Parent getInstance(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//create an object using relection API
		
		//step 1 
		//load the class dynamically
		Class cls =Class.forName(className);
		
		//step 2
		//create object for the loaded class
		Parent parent = (Parent) cls.newInstance();
		
		return parent;
	}
	
	
	
	

}
