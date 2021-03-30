package com.demo;

public class StudentClient {

	public static void main(String[] args) {

		Student s1 = Student.builder().id(1).name("akshara").gender("female").branch("ece").build();

		Student s2 = Student.builder().id(2).name("bharath").gender("nale").branch("ece").build();

		Student s3 = Student.builder().id(3).name("chandu").gender("male").branch("ece").build();

		// verify the hashcode

		System.out.println(s1.hashCode());

		System.out.println(s2.hashCode());

		System.out.println(s3.hashCode());

		if (s1.equals(s2)) {
			System.out.println("data of both objects are same");
		} else {
			System.out.println("data of both objects are not same");
		}

		System.out.println(s1.getGender());

		// 1-akshara
		// String reponse1 = s1.getId()+"-"+s1.getName()
		String reponse1 = getNameandIDfromStudent(s1);

		String reponse2 = getNameandIDfromStudent(s2);

		String reponse3 = getNameandIDfromStudent(s3);

		System.out.println(reponse1);
		System.out.println(reponse2);
		System.out.println(reponse3);

		
		System.out.println(s1.getName());
		passByValue(s1);
		System.out.println(s1.getName());

	}

	private static String getNameandIDfromStudent(Student student) {

		return student.getId() + "-" + student.getName();
	}

	private static void passByValue(Student student) {
		student.setName("test");

	}

}
