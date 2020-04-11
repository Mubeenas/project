package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.StepDefinition.Search;
import com.baseclass.Library;
import com.pages.LoginPage;

public class searchpage {
	WebDriver driver;
	LoginPage mylogin;

	public searchpage(WebDriver driver) {
		this.driver = driver;
	}



	public void search_product() // searching the product
	{
		driver.findElement(
				By.xpath("/html/body/div[2]/div[1]/div/div/div/div[1]/div/div[2]/div[2]/div[2]/div/form/input"))
				.sendKeys("books");
		driver.findElement(By.className("search-go")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div[1]/div/div[2]/div[2]/div[2]/div/form/input")).sendKeys(Keys.BACK_SPACE);
		// driver.findElement(By.id("search-input")).sendKeys("electronics");

		// driver.findElement(By.className("search-go")).click();
	}

	public void search_results() // closing the current tab
	{
		String a = driver.findElement(By.xpath("//*[@id=\"search-result-items\"]/li/div/div[2]/span[1]/a")).getText();
		System.out.println(a);
	}
}
