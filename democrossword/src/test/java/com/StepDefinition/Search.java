package com.StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Excelutility.Excel;
import com.baseclass.Library;
import com.pages.LoginPage;
import com.pages.searchpage;
import com.seleniumutility.ScreenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search extends Library        //extending library file
{ 
	Logger LOG = LogManager.getLogger(Search.class.getName());
	ScreenShot util;
	searchpage SearchPro = null;
	LoginPage mylogin = null;
	Excel excel = null;

	@Given("user launch the chrome application")        //launching the browser
	public void user_launch_the_chrome_application() {
		launch();
		//mylogin = new LoginPage(driver);
		SearchPro = new searchpage(driver);
		excel = new Excel();
		LOG.info("launched the application");

	}

	@When("the user loggedin to the home page")      // user logging in home page
	public void the_user_loggedin_to_the_home_page() throws Throwable {

		mylogin = new LoginPage(driver);
		mylogin.login();                             //calling the methods which are used in login page
		mylogin.details(excel.Excel_username(1), excel.Excel_password(1));  // getting values from excel sheet
        mylogin.submit();
		Thread.sleep(900);
		LOG.info("user logged into the home page");

	}

	
	@Then("the user search the product")            //searching the product
	public void the_user_search_the_product() {
		SearchPro.search_product();
		LOG.info("user searched the product");
	}



	@Then("click enter to get result")          //results will be displayed
	public void search_result_are_displayed() 
	{
		SearchPro.search_results();
		LOG.info("clicked enter");
        util = new ScreenShot(driver);         //screenshot process
		util.SnapShot(
				"C:\\Users\\DELL\\eclipse-workspace\\democrossword\\src\test\\resources\\screenshots\\searchpage.png");
		LOG.info("ScreenShot took Successfully");
		System.out.println("ScreenShot is Successfully Taken");
	}

}
