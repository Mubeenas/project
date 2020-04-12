package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout {


	WebDriver driver;
	LoginPage mylogin;

	public Logout(WebDriver driver) {
		this.driver = driver;
	}
	//By logout=By.xpath("")
	public void logout()
	{
		driver.findElement(By.linkText("Logout")).click();
	}

































}
