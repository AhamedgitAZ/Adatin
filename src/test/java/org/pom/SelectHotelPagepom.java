package org.pom;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPagepom extends BaseClass {
	
	public SelectHotelPagepom () {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@name=\"radiobutton_0\"]")
	private WebElement selectButton;
	@FindBy(xpath="//input[@type=\"submit\"]")
	private WebElement continueButton;
	public WebElement getSelectButton() {
		return selectButton;
	}
	public WebElement getContinueButton() {
		return continueButton;
	}
	
	

}
