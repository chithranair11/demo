package com.pratian.demo.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SignIn {

	WebDriver driver;
	private final String siteUrl = "https://www.google.com/intl/en-GB/gmail/about/#";
	private final String expectedUrl = "https://www.google.com/intl/en-GB/gmail/about/#";
	private final String expectedTitle = "";
	private final String homePageError = "home page is not displayed";

	//private SearchHeader searchHeader;

	private By username = By.name("identifier");
	
	private By nextlink=By.xpath("//*[@id='identifierNext']/span/span");

	private By password = By.id("Password");

	private By signInapp = By.xpath("//*[@id='passwordNext']/span/span");
	
	private By SigninLink= By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a");

	public SignIn(WebDriver driver) {

		this.driver = driver;
	}

	/**
	 * Open the application
	 *
	 * @return the home page
	 */
	public SignIn open() {
		driver.get(siteUrl);

		if (!driver.getCurrentUrl().contains(expectedUrl) || !driver.getTitle().contains(expectedTitle)) {
			// TestListener.reportLog(homePageError);
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return this;
	}

	public HomePage Login(String Username, String Password) throws InterruptedException {
		
		driver.findElement(SigninLink).click();
		driver.findElement(username).click();
		driver.findElement(username).sendKeys(Username);
		driver.findElement(nextlink).click();
		driver.findElement(password).click();
		driver.findElement(password).sendKeys(Password);
		driver.findElement(signInapp).click();
		return new HomePage(driver);
	}

	

}
