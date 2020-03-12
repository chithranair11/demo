package com.pratian.demo.TestPages;

import org.testng.Assert;

import com.pratian.demo.Pages.BaseTestClass;
import com.pratian.demo.Pages.HomePage;
import com.pratian.demo.Pages.SignIn;
import com.pratian.demo.util.Excel;
import com.pratian.demo.util.PropertyFile;

public class SiginPageTest extends BaseTestClass {
	PropertyFile property=new PropertyFile();
	Excel excel=new Excel(property.get("ExcelPathForTestData"));
	
	public void verifyLogin()
	{
		SignIn sign =new SignIn(driver);
		
		sign.open();
		
		try {
			sign.Login(excel.readData("Login", "UserName", 1), excel.readData("Login", "Password", 1));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		HomePage home=new HomePage(driver);
		
		String actual=home.getPageTitle();
		String expected="Gmail";
	    Assert.assertEquals(actual, expected);
	
		
		driver.close();
	}
	
	
	

}
