package com.demo.interfacepractice;

public class Vespa extends BaseVehiceInfo implements Scooty{
	
	private ButtonInfo buttonInfo;
	
    public Vespa(String vehiceName, String model, String version, String colour, ButtonInfo buttonInfo) {
		super(vehiceName,model,version,colour);
		this.buttonInfo = buttonInfo;
	}


	
	

	

	@Override
	public ButtonInfo getButtonInfo() {
	
		return buttonInfo;
	}

}
