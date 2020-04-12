package com.StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Excelutility.Excel;
import com.baseclass.Library;
import com.pages.LoginPage;
import com.pages.Logout;
import com.seleniumutility.ScreenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logoutt extends Library {
	Logger LOG = LogManager.getLogger(Search.class.getName());
	ScreenShot util;
	Logout logg= null;
	LoginPage mylogin = null;
	Excel excel = null;




	@Given("^launched the browser$")
	public void launched_the_browser() throws Throwable {
		
		launch();
		//mylogin = new LoginPage(driver);
		logg = new Logout(driver);
		excel = new Excel();
		LOG.info("launched the application");

	    
	}

	@When("^login is opened$")
	public void login_is_opened() throws Throwable {
		
		mylogin = new LoginPage(driver);
		mylogin.login();                             //calling the methods which are used in login page
		mylogin.details(excel.Excel_username(1), excel.Excel_password(1));  // getting values from excel sheet
        mylogin.submit();
		Thread.sleep(900);
		LOG.info("user logged into the home page");
		
	   
	}

	@Then("^logout the page$")
	public void logout_the_page() throws Throwable {
	   logg.logout(); 
	   LOG.info("clicked enter");
       util = new ScreenShot(driver);         //screenshot process
		util.SnapShot(
				"C:\\Users\\DELL\\eclipse-workspace\\democrossword\\src\test\\resources\\screenshots\\Logout.png");
		LOG.info("ScreenShot took Successfully");
		System.out.println("ScreenShot is Successfully Taken");
		}































}
