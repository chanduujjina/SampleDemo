package com.demo.abstarct;

import java.util.Arrays;
import java.util.List;

public class Att extends Carrier{

	@Override
	public String toString() {
		return "Att [carrierId=" + carrierId + ", carrierName=" + carrierName + ", plan=" + plan + "]";
	}

	private int carrierId;
	private String carrierName;
	
	private Plan plan;
	
	public Att(int carrierId, String carrierName, Plan plan) {
		super();
		this.carrierId = carrierId;
		this.carrierName = carrierName;
		this.plan =plan;
	}
	
	

	@Override
	public Plan getPlan() {
		
		return plan;
	}

  
	@Override
	public boolean singleCarrierPerHead(String  customerName) {
		
		//fetch customer list
		List<String> customerList =getCustomerList();
		return customerList.contains(customerName);
	}
	
	private List<String> getCustomerList(){
		return Arrays.asList("chandu","akshara","Manoj");
	}
	
	

}
