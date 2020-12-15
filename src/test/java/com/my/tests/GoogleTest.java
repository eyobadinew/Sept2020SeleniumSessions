package com.my.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
WebDriver driver;
	
	@BeforeMethod   
		public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	}
	@Test(priority = 1)
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println("The page title is : "+title);
		
		Assert.assertEquals(title, "Google");
	}

	@Test(priority = 2)
	public void googleUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("The url is :"+url);
		Assert.assertTrue(url.contains("google"));
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
