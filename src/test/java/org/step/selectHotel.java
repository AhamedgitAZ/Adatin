package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.SelectHotelPagepom;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class selectHotel extends BaseClass{

	@Given("User clicks select button")
	public void user_clicks_select_button() {

		SelectHotelPagepom b = new SelectHotelPagepom();

		WebElement selectButton = b.getSelectButton();
		buttonClick(selectButton);

	}

	@And("User clicks continue button")
	public void user_clicks_continue_button() {
		SelectHotelPagepom b = new SelectHotelPagepom();	
		WebElement continueButton = b.getContinueButton();
		buttonClick(continueButton);
		

	}

	@Then("User navigates to Book A Hotel page")
	public void user_navigates_to_Book_A_Hotel_page() {

		 System.out.println("Successfully navigated to Book A Hotel Page");
	}

}
