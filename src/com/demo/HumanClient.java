package com.demo;

public class HumanClient {

	public static void main(String[] args) {
		//create object 1

		Human human = new Human();
		human.setHeight(10);
		human.setWeight(50);
		
		//calling method
		human.canEat();
		
		human.canSleep();
		
		System.out.println(human);
		
		//create another object
		
		Human human1 = new Human();
		
		
		human1.setHeight(20);
		human1.setWeight(40);
		
		//calling method
		human1.canEat();
		
		human1.canSleep();
		
		System.out.println(human1);
		
		
		
	}

}
