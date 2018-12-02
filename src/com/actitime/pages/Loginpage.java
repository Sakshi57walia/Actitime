package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.Basepage;

public class Loginpage extends Basepage {

	@FindBy(xpath = "//input[@id='username']")
	private WebElement un;
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement pm;
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement login;
	@FindBy(xpath = "//nobr[contains(text(),'actiTIME 2017.4')]")
	private WebElement version;

	public Loginpage(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub

	}

	public void enterUsername(String udn) {
		un.sendKeys(udn);
	}

	public void enterPassword(String und) {
		pm.sendKeys(und);

	}

	public void enterlogin() {
		login.click();
	}

	public void VerifyPage(String eTitle) {
		verifytitle(eTitle);

	}

	public void verifyVersion() {
		System.out.println("version::::" + version.getText());
	}

}
