package com.demo;

public class MetthodDemo {

	public static void main(String[] args) {
		MetthodDemo demo = new MetthodDemo();
		
		//method call for void method
		demo.m1();
		
		int value = demo.getValue(10);
		
		System.out.println(value);
		

	}
	
	//void method
	//method implementation
	public void m1() {
		System.out.println("inside m1");
	}
	
	//method with return type
	
	public int getValue(int num) {
		return num;
	}

}
