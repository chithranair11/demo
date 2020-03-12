package com.pratian.demo.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass {
	
	public WebDriver driver;
	private final String chromepath=".\\src\\main\\resources\\chromedriver.exe";
	
	@BeforeMethod
	private void setUp(){
		
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
	}
	

}
