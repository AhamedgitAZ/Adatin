package org.pom;

import org.base.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPagepom extends BaseClass {

	public BookHotelPagepom() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement firstName;

	@FindBy(name = "last_name")
	private WebElement secondName;

	@FindBy(name = "address")
	private WebElement billingAddress;

	@FindBy(id = "cc_num")
	private WebElement creaditCardNo;

	@FindBy(id = "cc_type")
	private WebElement creditCardType;

	@FindBy(name = "cc_exp_month")
	private WebElement expiryMonth;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getSecondName() {
		return secondName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreaditCardNo() {
		return creaditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNowButton() {
		return bookNowButton;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	@FindBy(name = "cc_cvv")
	private WebElement cvvNumber;

	@FindBy(name = "book_now")
	private WebElement bookNowButton;

	@FindBy(id = "cc_exp_year")
	private WebElement expYear;

}
