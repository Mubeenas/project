package com.StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.LoginPage;
import com.seleniumutility.ScreenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends Library {
	Logger LOG = LogManager.getLogger(Login.class.getName()); //extents reports
	ScreenShot util;
	LoginPage mylogin = null; //creating object

	@Given("I launch the browser and enter the url")//launching the browser
	public void i_launch_the_browser_and_enter_the_url() {
		launch();
		LOG.info("Browser is Launched");
		mylogin = new LoginPage(driver);

	}

	@When("login page is opened")           //login page will be opened
	public void login_page_is_opened() {

		mylogin.login();
		LOG.info("Login Page is Called");

	}

//	@Then("I enter the {string} and {string}")     //entering the details of login
	@Then("^I enter the (.+) and (.+)$")
	public void i_enter_the__and(String username, String password) {
		mylogin.details(username, password);
		LOG.info("Entered Username and Password");
	}

	@Then("I click on the signin button")         //clicking on sign in button
	public void i_click_on_the_signin_button() {
		mylogin.submit();
		LOG.info("Clicked on Signin Button");

		util = new ScreenShot(driver);
		util.SnapShot(
				"C:\\Users\\DELL\\eclipse-workspace\\democrossword\\src\\test\\resources\\screenshots\\LoginPage.png");
		LOG.info("ScreenShot took Successfully");
		System.out.println("ScreenShot is Successfully Taken");
	}
}