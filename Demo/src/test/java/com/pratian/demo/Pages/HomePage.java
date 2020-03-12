package com.pratian.demo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	private By PageTitle= By.xpath("//*[@id='gb']/div[2]/div[1]/div[4]/div/a");
	
	public HomePage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	public String getPageTitle(){
		
		
		return driver.findElement(PageTitle).getText();
	}
	
	

}
