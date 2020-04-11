package com.TestRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\DELL\\eclipse-workspace\\democrossword\\src\\test\\resources\\features\\testcase.feature",
	    glue = {"com.StepDefinition"},
		plugin = {"pretty", "html:reports/cucumber-html-report",
				},
	  tags = {"@TC_02_crossword",},
		monochrome = true,
	
		strict = true
		)

		


public class Login_Runner {

}