package org.pom;

import org.base.BaseClass;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdatinHomePage extends BaseClass {

	//WebDriver driver;

	public AdatinHomePage() {

		PageFactory.initElements(driver, this);

	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(xpath = "//input[@type=\"text\"]")
	private WebElement username;

	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement password;
	@FindBy(xpath = "//input[@type=\"Submit\"]")
	private WebElement login;

}
