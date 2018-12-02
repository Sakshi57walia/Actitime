package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.Basepage;

public class Timetrack extends Basepage {

	public Timetrack(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "logoutlink")
	private WebElement logoutbtn;

	public void enterTimetrackpage(WebDriver driver)

	{
		PageFactory.initElements(driver, this);

	}

	public void clickonlogut() {

		logoutbtn.click();
	}

}
