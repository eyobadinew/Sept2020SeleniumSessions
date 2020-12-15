package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtablePrep {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
		driver.get("https://chercher.tech/webdriverio/dynamic-webtable");
		
		getCheck("google.com");
		getCheck("Chercher.tech");
		getCheck("facebook.com");
		getCheck("selenium-webdriver.com");
		
	//	driver.close();
		
		//driver.
	//	findElement(By.xpath("//td[text() ='facebook.com']//preceding-sibling::td/input[@type='checkbox']")).click();
	//	driver.
	//	findElement(By.xpath("//td[text() ='selenium-webdriver.com']//preceding-sibling::td/input[@type='checkbox']")).click();
	}
 public static void getCheck(String titleName) {
	 driver.
		findElement(By.xpath("//td[text() ='"+titleName+"']//preceding-sibling::td/input[@type='checkbox']")).click();
 }
	
}
