package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitForElementLocated {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://app.hubspot.com/");
		
		By emailId = By.id("username");
		
	//	WebDriverWait wait = new WebDriverWait(driver,10);
	//	WebElement e = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
    //    e.sendKeys("abcd@gmail.com");
	//	driver.findElement(By.id("password")).sendKeys("@1234");
		
		waitForElementToBeLocated(emailId,10).sendKeys("abcd@gmail.com");
	}

	public static WebElement waitForElementToBeLocated(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        
	}
	
	
}
