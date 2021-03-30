package com.demo;

import lombok.Builder;
import lombok.Data;


@Builder

@Data
public class Student {
	
	private int id;
	
	private String name;
	
	private String branch;
	
	private String gender;

}
