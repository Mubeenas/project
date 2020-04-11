package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library {
	public WebDriver driver=null;

	public void launch() {
		System.setProperty("WebDriver.chrome.driver", "./chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.crossword.in/");
	}

	public void quit() {
		driver.close();
	}
public void launch1()
{
	System.setProperty("WebDriver.firefox.driver","C:/Users/DELL/Downloads/geckodriver.exe");
	 driver=new FirefoxDriver();
	driver.get("https://www.crossword.in/");
}





}
