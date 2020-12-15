package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForUrl {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=eyobadinew&oq=eyobadinew&aqs=chrome..69i57j0i333l2j69i61l2.3534j0j4&sourceid=chrome&ie=UTF-8");
		
		driver.findElement(By.xpath("//span[text()='Eyob Adinew | Addis Ababa University - Academia.edu']")).click();
		// WebDriverWait wait = new WebDriverWait(driver,6);
	//	boolean b = wait.until(ExpectedConditions.urlContains("EyobAdinew"));
		//System.out.println(b);
	//	System.out.println(driver.getCurrentUrl());
		if(waitForurl("EyobAdinew",6)) {
			System.out.println(driver.getCurrentUrl());
		}
	}
public static boolean waitForurl(String urlValue,int timeout) {
	WebDriverWait wait = new WebDriverWait(driver,timeout);
	return wait.until(ExpectedConditions.urlContains(urlValue));
}
}
