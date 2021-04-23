package com.demo.abstarct;

public abstract class Carrier {
	
	
	//concrete method
	public String getSimSize() {
		return "3*4";
	}
	
	public boolean isPortable() {
		return true;
	}
	
	//abstact method
	abstract Plan getPlan();
	
	abstract boolean singleCarrierPerHead(String  customerName) ;

}
