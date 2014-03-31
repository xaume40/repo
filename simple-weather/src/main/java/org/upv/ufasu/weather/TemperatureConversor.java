package org.upv.ufasu.weather;

public class TemperatureConversor {
	
	public TemperatureConversor(){
		
	}
	
	
	public static String deFac(String F) {
	
		if (F!=null) {
			int gradosF = Integer.parseInt(F);
			int gradosC = (int) Math.round((gradosF-32)/1.8);
			return String.valueOf(gradosC);
		} else {
			return "";
		}
		
	}

}
