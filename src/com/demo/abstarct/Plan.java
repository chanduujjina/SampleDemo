package com.demo.abstarct;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Plan {
	
	private int planId;
	
	private String planName;
	
	private String planeDetails;
	
	private String expiryDate;
   

}
