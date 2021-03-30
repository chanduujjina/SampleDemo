package com.demo;

public class ForLoopDemo {

	public static void main(String[] args) {

		// print first 10 numbers
		//1,2,3,4,7,8,9,10
        //6,7,8,9,10
		for (int i = 1; i <= 10; i++) {
			if(i==5 || i==6) {
				continue;
			}
			//System.out.println("number " + i);
		}
		
		//1 to 10
		//1,2,4,5,7,8
		
		for (int i = 1; i <= 10; i++) {
			if(i==3 || i==6) {
				continue;
			}
			if(i>8) {
				break;
			}
			//System.out.println("number " + i);
		}
		
		//print in descending order
		
		/*for(int i=10;i>=1;i--) {
			System.out.println("number " + i);
		}*/
		
		//row =1
		   //column =1,2(fail)
		
		//row =2
		  //column =1,2,3(fail)
		
		// row =3
		//column =1,2,3,4()
		
		//row =10
		//column =1,2,3,4,5,6,7,8,9,10,11(fail)
		
		//row =11()
		
		for(int row=1;row<=10;row++) {
			for(int column= 1;column<=row;column++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}

	}

}
