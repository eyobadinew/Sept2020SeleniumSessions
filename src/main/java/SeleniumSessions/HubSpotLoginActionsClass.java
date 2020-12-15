package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HubSpotLoginActionsClass {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver();
          driver.get("http://hubspot.com/login");
         
          Thread.sleep(6000);
          
          By email = By.id("username");
          By Password = By.id("password");
          By Login = By.id("loginBtn");

    Actions act = new Actions(driver);
	act.sendKeys(driver.findElement(email), "abc@gmail.com").perform();
	act.sendKeys(driver.findElement(Password), "123456").perform();
	act.click(driver.findElement(Login)).perform();

          
          
          //All of The following  codes reveal  Generic methods 
	
	
//	doActionSendKeys(email,"abc@gmail.com");
	//doActionSendKeys(Password,"12345");
	//doActionClick(Login);
	
	
	}
  /* public static WebElement getElement(By locator) {
	return driver.findElement(locator);   
   }*/
	/*public static void doActionSendKeys(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}*/
	
	/*	public static void doActionClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();;
	}*/
}
