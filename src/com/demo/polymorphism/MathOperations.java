package com.demo.polymorphism;

public class MathOperations {
	
	
	
	private int addValues(int a, int b) {
		return a+b;
	}
	
	public int addValues(int a, int b,int c) {
		if(c == 0) {
			return addValues(a,b);
		}
		return a+b+c;
	}
	
	public double addValues(double a ,int b) {
		return a+b;
	}
	
	public double addValues(double a, double b) {
		return a+b;
	}
	
	//public --access modifer
	//int -- return type
	//addValues --methodName
	//(int a,int b)  -->arguement list
	//addValues(int a, int b) ->Method signature

}
