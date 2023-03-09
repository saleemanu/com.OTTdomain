package com.eshop.TestBaseClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public TestBaseClass() {
		prop = new Properties();
		FileInputStream fis;

		try {
			fis = new FileInputStream(
					"C:\\Users\\HP\\eclipse-workspace\\OTTPlatform\\src\\main\\java\\com\\eshop\\config\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void initialization() {
		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		} else {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get(prop.getProperty("testurl"));

	}

}
