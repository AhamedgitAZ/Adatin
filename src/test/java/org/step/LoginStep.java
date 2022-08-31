package org.step;

import org.base.BaseClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.AdatinHomePage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep extends BaseClass{
	
	
	@Given("User launches the adactin url")
	public void user_launches_the_adactin_url() {
	   
	//	WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		//driver.get("http://adactinhotelapp.com/index.php");
		
		browserLaunch("http://adactinhotelapp.com/index.php");
	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password() {
	    
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("AHAMEDNAWAZ");
		//driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Ahamed@123");
        AdatinHomePage a = new AdatinHomePage();
        enterText(a.getUsername(),"AHAMEDNAWAZ");
        enterText(a.getPassword(),"Ahamed@123");
	}

	@And("User clicks the login button")
	public void user_clicks_the_login_button() {

           //driver.findElement(By.xpath("//input[@type=\"Submit\"]")).click();
		 AdatinHomePage b = new AdatinHomePage();
		 buttonClick(b.getLogin());
	}

	@Then("User navigates to Search Hotel page")
	public void user_navigates_to_Search_Hotel_page() {
	    
		System.out.println(" Logi in sucessfully");
	}




}
