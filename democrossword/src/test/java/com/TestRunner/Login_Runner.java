package com.TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import com.cucumber.listener.Reporter;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\DELL\\eclipse-workspace\\democrossword\\src\\test\\resources\\features\\testcase.feature",
				 
	    glue = {"com.StepDefinition"},
		plugin = {"pretty", "html:reports/cucumber-html-report",
				"junit:target/cucumber-junit-report",
        "com.cucumber.listener.ExtentCucumberFormatter:target/Extentreports/Extentreport.html"},
				
	  //tags = {"@TC_02_crossword",},
		monochrome = true,
	
		strict = true
		)

		


public class Login_Runner {

}