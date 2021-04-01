package com.demo.stat;

public class StaticInfo {
	
	//creating static varible
	
	private static String name;
	
	public static String globalInfo ="test";
	
	
	
	//static block
	
	static {
		name = "Akshara";
	}
	
	// static method
	
	public static String getName() {
		return name;
	}

}
