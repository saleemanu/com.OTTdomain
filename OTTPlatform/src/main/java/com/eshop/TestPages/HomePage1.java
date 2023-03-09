package com.eshop.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eshop.TestBaseClasses.TestBaseClass;

public class HomePage1 extends TestBaseClass {

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement home;

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")
	WebElement product;

	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	WebElement cart;

	@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
	WebElement signin;

	@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[8]/a[1]")
	WebElement contactus;

	@FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[1]/div[1]/h2[1]")

	WebElement category;

	public HomePage1() {
		PageFactory.initElements(driver, this);
	}

	public void clickhomepage() {
		home.click();
	}

	public String verifytitle() {
		String title = driver.getTitle();
		return title;
	}

	public boolean verifycategory() {

		boolean cat = category.isDisplayed();
		return cat;
	}

}
