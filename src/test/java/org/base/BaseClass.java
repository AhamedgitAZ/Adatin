package org.base;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	protected static WebDriver driver;

	public static void browserLaunch(String url) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	public static void enterText(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void buttonClick(WebElement element) {

		element.click();
	}
	public static void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}
	public static void selectByValue(WebElement element,String value) {
		Select s= new Select(element);
		s.selectByValue(value);
		
	}
	public static void selectByVisibleText(WebElement element ,String text) {
		Select s= new Select(element);
		s.selectByVisibleText(text);
	
	}
	
	public static void enterDate(WebElement element, String date) {
		element.sendKeys(date);
	}
	
	
	
}