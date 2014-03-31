package org.upv.ufasu.weather.test;

import java.io.InputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.upv.ufasu.weather.TemperatureConversor;
import org.upv.ufasu.weather.Weather;
import org.upv.ufasu.weather.YahooParser;

public class YahooConversorTest extends TestCase {

	public YahooConversorTest (String name){
		super(name);
	}
	 

	static String gradosC = "10";
	static String gradosF = "50";
	
	public void testConv() throws Exception {
			String temp = TemperatureConversor.deFac(gradosF);
			assertEquals(temp,gradosC);
	}
}
