package com.demo.abstarct;

public class Verizon extends Carrier{
	
	
	
	@Override
	public String toString() {
		return "Verizon [carrierId=" + carrierId + ", carrierName=" + carrierName + ", plan=" + plan + "]";
	}
	private int carrierId;
	private String carrierName;
	private Plan plan;
	
	public Verizon(int carrierId, String carrierName,Plan plan ) {
		super();
		this.carrierId = carrierId;
		this.carrierName = carrierName;
		this.plan = plan;
	}
	@Override
	public Plan getPlan() {
		return plan;
	}
	@Override
	boolean singleCarrierPerHead(String  customerName) {
		// TODO Auto-generated method stub
		return false;
	}
}
