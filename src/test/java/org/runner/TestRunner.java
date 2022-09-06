package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
//		"D:\\Bank\\AdatinPage2\\src\\test\\resources\\Feature\\Login.feature",
//		"D:\\Bank\\AdatinPage2\\src\\test\\resources\\Feature\\searchHotel.feature",
//			"D:\\Bank\\AdatinPage2\\src\\test\\resources\\Feature\\selectHotel.feature",
	
	"D:\\Bank\\AdatinPage2\\src\\test\\resources\\Feature"
	
		}, dryRun =false, monochrome = true, glue = "org.step")
public class TestRunner {

	System.out.println(" checking the git hub");
}