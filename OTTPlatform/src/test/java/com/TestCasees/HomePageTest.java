package com.TestCasees;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eshop.TestBaseClasses.TestBaseClass;
import com.eshop.TestPages.HomePage1;

public class HomePageTest extends TestBaseClass {
	
	HomePage1 home;
	
	
	@BeforeMethod
	void SetUp()
	{
		initialization();
		home=new HomePage1();
	}
	
	
	public HomePageTest()
	{
		super();
	}
	
	
	@Test(priority=0)
	public void homeclick() {
		String title = home.verifytitle();
		Assert.assertEquals(title, "Automation Exercise");
	}

	@Test(priority=1)
	public void verifyhomepage1()
	{
		boolean homevisible=home.verifycategory();
		Assert.assertEquals(true, homevisible);
	}
	
	
	
	
	@AfterMethod
	void TearDown()
	{
		driver.quit();
	}
	
}
