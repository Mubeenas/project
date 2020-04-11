package com.StepDefinition;

import com.pages.LoginPage;
import com.pages.TrackPage;
import com.seleniumutility.ScreenShot;
import com.baseclass.Library;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Track extends Library {
	Logger LOG = LogManager.getLogger(Login.class.getName());//extents reports
	ScreenShot util = null;      
	
	LoginPage mylogin = null; //using objects from login page
	TrackPage Trackin = null;  // creating the objects to call methods 

	@Given("launch the browser")      //launching the broswer
	public void launch_the_browser() {		
		launch();
		Trackin = new TrackPage(driver);
		mylogin = new LoginPage(driver);
		util = new ScreenShot(driver);   
		LOG.info("launched the browser");
	}

	

	@When("the login homepage is opened")        //login home page opening 
	public void the_login_homepage_is_opened() throws Throwable {

		mylogin.login();            //calling the methods from login page
		mylogin.details("mubeenas951@gmail.com", "mubeenask");
		mylogin.submit();
		Thread.sleep(900);
		LOG.info("homepage is opened");
	}

	@Then("the user track the product")     // tracking the product
	public void the_user_track_the_product() {
		
		Trackin.Track_product();
		Trackin.ordernumber();
		LOG.info("tracked the product");
	}

	@Then("click on submit button")     //submitting the tracking details

	public void click_on_submit_button() {
		
		Trackin.submit();
		LOG.info("clicked on submit");		
		util.SnapShot(
				"C:\\Users\\DELL\\eclipse-workspace\\democrossword\\src\\test\\resources\\screenshots\\TrackPage.png");
		LOG.info("ScreenShot took Successfully");
		System.out.println("ScreenShot is Successfully Taken");
	}
}
