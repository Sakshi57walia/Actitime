package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	protected WebDriver driver;

	@BeforeMethod
	public void preCondition() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sakku\\workspace_1\\Actitime\\src\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("http://localhost/login.do");
		Thread.sleep(1000);

	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
