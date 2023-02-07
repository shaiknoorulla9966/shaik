package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.Genral;

public class TC002 {
	//public static void main(String args[]) {
		//test steps
	@Test
//	Domconfigurator.configure("Log4j.xml");
	public void tc002() {
		DOMConfigurator.configure("log4j.xml");
		
		Genral obj=new Genral();
		obj.openApplication();
		obj.login();
		obj.enterintoframe();
		obj.addnewemploy();
		obj.exitframe();
		obj.logout();
		obj.closeApplication();
			
			
		}
		
	}


