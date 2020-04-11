package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.pages.LoginPage;

public class TrackPage {
	By Track=By.xpath("//*[@id=\"hd\"]/div/div/div/div[1]/div/div[2]/div[1]/a[6]");	
	By order=By.xpath("//*[@id=\"order_id\"]");
	
	
	WebDriver driver;
	LoginPage mylogin;
	
	public TrackPage(WebDriver driver)
	{
			 this.driver=driver;
		 }
	
	
//	public void dologin(String username, String password) throws Throwable {
//		mylogin = new LoginPage(driver);
//		mylogin.url();
//		mylogin.login();
//		mylogin.details(username, password);
//		mylogin.submit();
//	}
	
	public void Track_product()
	{
	driver.findElement(Track).click();
	}
	public void ordernumber()
	{
		driver.findElement(order).sendKeys("91508509");
	}
	
	public void submit()

	{
	driver.findElement(By.name("commit")).click();
	}
	
	
	
	
	
	
	
	
	

}
