package com.demo;

public class TernaryDemo {

	public static void main(String[] args) {
		
		int num1=10;
		
		int num2=20;
		
		int num3 =40;
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1+" is largest number");
			}
			else {
				System.out.println(num3+" is largest number");
			}
		}
		else {
			if(num2>num3) {
				System.out.println(num2+" is largest number");
			}
			else {
				System.out.println(num3+" is largest number");
			}
		}
		
	int largestNumber= 	num1>num2 ? num1>num3 ? num1 : num3 :num2>num3 ? num2:num3;
	
	System.out.println("largestNumber::"+largestNumber);
		
		String result = num1>num2 ? num1 +" is greater than "+num2 : num2 +" is greater than "+num1;
		
		System.out.println(result);

	}

}
