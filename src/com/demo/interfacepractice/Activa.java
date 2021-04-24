package com.demo.interfacepractice;

public class Activa extends BaseVehiceInfo implements Scooty{
	
	
   @Override
	public String toString() {
		return "Activa [buttonInfo=" + buttonInfo + "]";
	}

private ButtonInfo buttonInfo;
	
	public Activa(String vehiceName, String model, String version,String colour, ButtonInfo buttonInfo) {
		super(vehiceName,model,version,colour);
	    this.buttonInfo = buttonInfo;
	}

	@Override
	public ButtonInfo getButtonInfo() {
		return buttonInfo;
	}

}
