package com.pages;

import java.util.concurrent.TimeUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	By login = By.xpath("//*[@id=\"hd\"]/div/div/div/div[1]/div/div[2]/div[1]/a[2]");
	By username = By.xpath("//*[@id=\"user_session_email\"]");
	By password = By.xpath("//*[@id=\"user_session_password\"]");
	By Login = By.xpath("//*[@id=\"user_session_submit\"]");

	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

    public void login() {
		driver.findElement(login).click();
	}

	public void details(String username, String password) {
		driver.findElement(By.id("user_session_email")).sendKeys(username);
		driver.findElement(By.id("user_session_password")).sendKeys(password);
	}

	public void submit()

	{
		driver.findElement(By.id("user_session_submit")).click();

	}

}
