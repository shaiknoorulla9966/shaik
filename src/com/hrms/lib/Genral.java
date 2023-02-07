package com.hrms.lib;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

import org.openqa.selenium.By;

public class Genral extends Global {
	//TO PROVIDE ALL RE_USEBULE FUN/METHODS RELATED WHOLE APPLICATI
	public void openApplication() {
		System.setProperty("webdriver.gecko.driver", "C:\\chrom driver selinume\\chromedriver_win32 (1)\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
		Log.info("Application opened");
		}
		public void closeApplication() {
		    driver.close();
		    System.out.println("Application closed");
		    Log.info("Application closed");
		}
		public void login() {
		    driver.findElement(By.name(txt_username)).sendKeys(username);
		    driver.findElement(By.name(txt_password)).sendKeys(password);
		    driver.findElement(By.name(btn_login)).click();
		    System.out.println("Login completed");
		    Log.info("Login completed");
		}
		public void logout() {
		    driver.findElement(By.linkText(link_logout)).click();
		    System.out.println("Logout completed");
		}
		public void enterintoframe() {
			driver.switchTo().frame(frame_empinfo);
			Reporter.log("entereed the frame");
			Log.info("entereed the frame");
			
		}
		public void exitframe() {
			driver.switchTo().defaultContent();
			System.out.println("frame is exited");
			Log.info("frame is exited");
			
		}
		public void addnewemploy() {
			driver.findElement(By.xpath(btn_Add)).click();
			driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
			driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
			driver.findElement(By.id(btn_save)).click();
			System.out.println("new employe is added");
			Log.info("new emloye is added");
		}
		}
		
		
	


