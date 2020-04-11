package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestSeller {
	WebDriver driver;
	
	
	By  continueshopping=By.xpath("//*[@id=\"shopping-cart-items\"]/div/a");
	By bestseller=By.xpath("//*[@id=\"content-slot\"]/div[4]/div/div/div/div[2]/div/a/img");
	By  ThePhoenix=By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div[1]/ul/div/div/li[2]/div/div[2]/span[1]/a");
	By available=By.xpath("//*[@id=\"iamavailable\"]/span/form/input[3]");
	
	public BestSeller(WebDriver driver)
	{
			 this.driver=driver;
		 }
	
	public void My_wishlist()
	{
		driver.findElement(By.className( "my-wish-list")).click();
		
	}
	
	public void  continueshopping()
	{
		driver.findElement(continueshopping).click();
	}
	
	public void  bestseller()
	{
		driver.findElement(bestseller).click();
	}
	
	
	public void phoenix()
	{
		driver.findElement(ThePhoenix).click();
	}
	
	public void available()
	{
		driver.findElement(available).click();
	}
	
	

}
