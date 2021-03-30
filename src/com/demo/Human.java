package com.demo;

public class Human {
	
	//Default Constructor
	public Human() {
		System.out.println("inside default constructor");
	}
	
	@Override
	public String toString() {
		return "Human [height=" + height + ", weight=" + weight + "]";
	}

	//instance varible
	//0 10
	private int height;
	
	private int weight;
	
	
	public void setHeight(int hgt) {
		this.height = hgt;
		
	}
	//mutator or setter
	public void setWeight(int wgt) {
		this.weight = wgt;
	}
	
	//accessor
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	
	
	public void canSleep() {
		System.out.println("he can sleep");
	}
	
	public void canEat() {
		System.out.println("he can eat");
	}

}
