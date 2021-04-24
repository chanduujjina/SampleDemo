package com.demo.interfacepractice;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseVehiceInfo {
	private String vehiceName;
	
	private String model;
	
	private String version;
	
	private String colour;
}
