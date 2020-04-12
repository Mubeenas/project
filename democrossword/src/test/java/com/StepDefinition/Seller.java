package com.StepDefinition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.baseclass.Library;
import com.pages.BestSeller;
import com.seleniumutility.ScreenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Seller extends Library{
	Logger LOG = LogManager.getLogger(Login.class.getName());
	ScreenShot util; 
    BestSeller seller=null;  //creating object to call methods 

 
    @Given("launching the browser")  //launching the browser
    public void launch_the_browser() {	
    launch1();
    seller = new BestSeller(driver);
	util = new ScreenShot(driver);   
	LOG.info("launched the browser");

}

@When("wishlist page is opened")     // clicking on wish list button
public void wishlist_page_is_opened() {
	//seller = new BestSeller(driver);
	seller.My_wishlist();
	util = new ScreenShot(driver);   
	LOG.info("wishlist opened");
	

	}
    @Then("continue shopping")       // choosing continue shopping
public void continue_shopping() {
    	//seller = new BestSeller(driver);
    	seller.continueshopping();
    	seller.bestseller();
    	seller.phoenix();
    	LOG.info("continued shopping");
    	
    }

    


@Then("tell me available")          //selecting tell me when available
public void tell_me_available() {
    seller.available();
    LOG.info("availble");


    util = new ScreenShot(driver);
	util.SnapShot("C:\\Users\\DELL\\eclipse-workspace\\democrossword\\src\\test\\resources\\screenshots\\ BestSeller.png");
		
	LOG.info("ScreenShot took Successfully");
	System.out.println("ScreenShot is Successfully Taken");
}

}
