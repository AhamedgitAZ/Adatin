package org.step;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.SearchHotelPagepom;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SearchHotel extends BaseClass {

	@Given("User enters all the mandatory fields")
	public void user_enters_all_the_mandatory_fields() {

		SearchHotelPagepom a = new SearchHotelPagepom();

		WebElement location = a.getLocation();
		selectByIndex(location, 2);

		WebElement numberOfRooms = a.getNoOfRooms();
		selectByIndex(numberOfRooms, 5);

		WebElement checkInDate = a.getCheckInDate();
		checkInDate.clear();
		enterDate(checkInDate, "05/04/2022");

		WebElement checkOutDate = a.getCheckOutDate();
		checkOutDate.clear();
		enterDate(checkOutDate, "10/04/2022");

		WebElement adultsPerRoom = a.getAdultsPerRoom();
		selectByIndex(adultsPerRoom, 2);
	}

	@When("User enters other fields if required")
	public void user_enters_other_fields_if_required() {
		SearchHotelPagepom a = new SearchHotelPagepom();

		WebElement hotels = a.getHotels();
		selectByValue(hotels, "Hotel Hervey");

		WebElement roomType = a.getRoomType();
		selectByVisibleText(roomType, "Super Deluxe");

		WebElement childPerRoom = a.getChildPerRoom();
		selectByValue(childPerRoom, "4");

	}

	@And("User clicks the search button")
	public void user_clicks_the_search_button() {
		SearchHotelPagepom a = new SearchHotelPagepom();

		buttonClick(a.getSearchButton());

	}

	@Then("User navigates to Select Hotel page")
	public void user_navigates_to_Select_Hotel_page() {

		System.out.println("Successfully navigated to Select Hotel Page");
	}

}
