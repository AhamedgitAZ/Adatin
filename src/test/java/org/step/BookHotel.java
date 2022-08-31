package org.step;

import org.base.BaseClass;



import org.pom.BookHotelPagepom;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BookHotel extends BaseClass{

	@Given("User enters all the fields marked with asterix")
	public void user_enters_all_the_fields_marked_with_asterix() throws InterruptedException {

		BookHotelPagepom d=new BookHotelPagepom();
		enterText(d.getFirstName(),"AHAMED");
		enterText(d.getSecondName(),"Nawaz");
		enterText(d.getBillingAddress(),"ANNA NAGAR,CHENNAI");
		selectByValue(d.getCreditCardType(),"AMEX");
		selectByIndex(d.getExpiryMonth(),5);
		selectByVisibleText(d.getExpYear(),"2022");
		enterText(d.getCvvNumber(),"123");
	}

	
	@And("User clicks book now button")
	public void user_clicks_book_now_button() {
		BookHotelPagepom d = new BookHotelPagepom();

		buttonClick(d.getBookNowButton());

	}

	@Then("User navigates to Booking Confirmation page")
	public void user_navigates_to_Booking_Confirmation_page() {

		System.out.println("Successfully navigated to Booking Confirmation Page");
	}

}
