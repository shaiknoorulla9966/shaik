package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.Genral;
public class TC001 {
	//public static void main(String args[]) {
	    //TestSteps
	@Test
		
	public void tc001() {
		DOMConfigurator.configure("log4j.xml");
		
	   Genral  obj  = new Genral();
	   obj.openApplication();
	   obj.login();
	   obj.logout();
	   obj.closeApplication();
	}
}
