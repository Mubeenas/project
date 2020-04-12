package com.TestRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\DELL\\eclipse-workspace\\democrossword\\src\\test\\resources\\features\\testcase.feature",
				 
	    glue = {"com.StepDefinition"},
		plugin = {"pretty", "html:reports/cucumber-html-report",
				"junit:target/cucumber-junit-report",
        "com.cucumber.listener.ExtentCucumberFormatter:target/Extentreports/Extentreport.html"},
				
	  //tags = {"@TC_05_crossword",},
		monochrome = true,
	
		strict = true
		)

		


public class Login_Runner {
	
	@AfterClass
	  public static void extendReport() {
	      Reporter.loadXMLConfig("src/test/resources/Test-Report.xml");
	      Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	      Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	      Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	      Reporter.setSystemInfo("Selenium", "3.141.59");
	      Reporter.setSystemInfo("Maven", "4.0.0");
	      Reporter.setSystemInfo("Java Version", "1.8.0_131");
	}


}