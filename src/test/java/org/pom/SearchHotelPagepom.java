package org.pom;

import org.base.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPagepom extends BaseClass{
	
	public SearchHotelPagepom () {
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//select[@name=\"location\"]")
	 private WebElement location;
	
	@FindBy(xpath="//select[@name=\"hotels\"]") 
	 private WebElement hotels;
	
	@FindBy(xpath="//select[@name=\"room_type\"]") 
	 private WebElement roomType;
	
	@FindBy(xpath="//select[@name=\"room_nos\"]") 
	 private WebElement noOfRooms;
	 
	@FindBy(id="datepick_in")  
	 private WebElement checkInDate;
	
	@FindBy(id="datepick_out") 
	 private WebElement checkOutDate;
	
	@FindBy(name="adult_room") 
	 private WebElement adultsPerRoom;
	
	@FindBy(name="child_room") 
	 private WebElement childPerRoom;
	 
	@FindBy(name="Submit") 
	 private WebElement searchButton;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	
	
}
