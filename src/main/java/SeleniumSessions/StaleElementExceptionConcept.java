package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExceptionConcept {

	public static void main(String[] args) {

     WebDriverManager.chromedriver().setup();
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
     WebElement a = driver.findElement(By.id("Form_submitForm_subdomain"));
     a.sendKeys("eyob@123");  
     driver.navigate().refresh();     
    // a.sendKeys("eyob@123");   // StaleElementReferenceException ... obtained after refresh ...how to solve this exception?
     // we have to comment out the code in line 20 and rewrite the driver.find and send keys code again after refreshment.
     a = driver.findElement(By.id("Form_submitForm_subdomain"));
     a.sendKeys("eyob@123");   // here the internal id changes prove it via debugger....
     
	}

}
