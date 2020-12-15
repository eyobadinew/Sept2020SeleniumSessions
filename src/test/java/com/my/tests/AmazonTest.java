package com.my.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
//	public static String TITLE = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
	WebDriver driver;
	
	@BeforeTest   
	// later change Before and AfterTest by BeforeMethod and AfterMethod and see that browser will be launched 3 times.
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
	}
	@Test(priority = 1)
	public void amazonTitleTest() {
		String title = driver.getTitle();
		System.out.println("The page title is : "+title);
		
		Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	// or //  	Assert.assertEquals(title,AmazonTest.TITLE ); called via global TITLE
	}

	@Test(priority = 2)
	public void amazonUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("The url is :"+url);
		Assert.assertTrue(url.contains("amazon"));
	}
	@Test(priority = 3)
	public void giftCardsLinkPresentTest() {
		boolean b =driver.findElement(By.xpath("//a[text()='Gift Cards']")).isDisplayed();
		System.out.println(b);
		Assert.assertTrue(b);
	//	or Assert.assertEquals(b, true);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
