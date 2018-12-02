package com.actitime.generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage {
	public WebDriver driver;

	public Basepage(WebDriver driver) {
		this.driver = driver;
	}
	
	public Basepage() {
		// TODO Auto-generated constructor stub
	}

	public void verifytitle(String etitle) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			System.out.println(driver.getTitle());
			wait.until(ExpectedConditions.titleIs(etitle));
			Reporter.log("title is" + etitle, true);
		} catch (Exception e)

		{
			Reporter.log("title is not mandatory" + true);
			Assert.fail();
			
		}
	}

	public void verifyElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {

			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is present", true);
		} catch (Exception e)

		{
			Reporter.log("title is not mandatory" + true);
			Assert.fail();
		}

	}

}
