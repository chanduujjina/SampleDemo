package com.demo.stat;

public class StatInfoClient {

	public static void main(String[] args) {
		
		//calling static method
		String name = StaticInfo.getName();
		
		//calling static varible
		String globalinfo = StaticInfo.globalInfo;
		
		System.out.println("globalinfo:"+globalinfo);
		
		System.out.println("name::"+name);

	}

}
