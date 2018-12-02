package com.actitime.tests;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import com.actitime.generic.Baseclass;

import com.actitime.pages.Loginpage;


public class Logout extends Baseclass {

	@Test
	public void tesrvalidlogin() throws InterruptedException {
		
		/*
		 * String user = Exceldata.getData(
		 * "C:\\Users\\sakku\\workspace_1\\Actitime\\src\\data\\Book1.xlsx",
		 * "Sheet1", 1, 0); //String pass = Exceldata.getData(
		 * "C:\\Users\\sakku\\workspace_1\\Actitime\\src\\data\\Book1.xlsx",
		 * "Sheet1", 1, 1); //String LoginTitle = Exceldata.getData(
		 * "C:\\Users\\sakku\\workspace_1\\Actitime\\src\\data\\Book1.xlsx",
		 * "Sheet1", 1, 2); //String enterTimetrack = Exceldata.getData(
		 * "C:\\Users\\sakku\\workspace_1\\Actitime\\src\\data\\Book1.xlsx",
		 * "Sheet1", 1, 3);
		 */
		Thread.sleep(1000);
		Loginpage lp = new Loginpage(driver);
		//Timetrack t = new Timetrack(driver);
		
		//Thread.sleep(5000);
		lp.enterUsername("Admin");
		lp.enterPassword("Manager");
		lp.verifyVersion();
		lp.enterlogin();
		
		lp.verifytitle("actiTIME - Login");
		//t.clickonlogut();

	}
}
