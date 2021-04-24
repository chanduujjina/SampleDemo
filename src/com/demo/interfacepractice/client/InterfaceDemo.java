package com.demo.interfacepractice.client;

import java.util.ArrayList;
import java.util.List;

import com.demo.interfacepractice.Activa;
import com.demo.interfacepractice.ButtonInfo;
import com.demo.interfacepractice.Navigation;

public class InterfaceDemo {
	
	public static void main(String[] args) {
		
		//actival details
		
		List<Navigation> navigationList = getNavigationDetailsForActiva();
		ButtonInfo activaButtonInfo = ButtonInfo.builder().navigationList(navigationList).build() ;
		
		Activa activa = new Activa("Activa","6G","BS6","grayback",activaButtonInfo);
		System.out.println(activa);
		
		
	}
	
	private static List<Navigation> getNavigationDetailsForActiva(){
		List<Navigation> list = new ArrayList();
		Navigation top = Navigation.builder().direction("top").action("opens fuel tank").build();
		Navigation bottom = Navigation.builder().direction("bottom").action("opens seat").build();
		list.add(top);
		list.add(bottom);
		
		return list;
	}
	

	
	

}
