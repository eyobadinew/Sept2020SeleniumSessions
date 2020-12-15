package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDropdown {
  static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
	/*	WebElement NoofEmployees = driver.findElement(By.id("Form_submitForm_NoOfEmployees"));
		Select s = new Select(NoofEmployees);
		s.selectByVisibleText("21 - 25");
		s.selectByIndex(2);
		s.selectByValue("201 - 250");
	
		 
		WebElement Industry = driver.findElement(By.id("Form_submitForm_Industry"));
		Select I = new Select(Industry);
		I.selectByVisibleText("Agriculture / Forestry");
		//I.selectByIndex(2);
		//I.selectByValue("201 - 250"); */
	By Country = By.id("Form_submitForm_Country");
	By Industry = By.id("Form_submitForm_Industry");
	doSelectDropdownByVisibleText(Country,"Brazil");
	doSelectDropdownByVisibleText(Industry,"Education");
	
	
	
	
	
	
	} 
    // generic method
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSelectDropdownByVisibleText(By locator,String text) {
		getElement(locator);
		Select s = new Select(getElement(locator));
		s.selectByVisibleText(text);
		
	}
	
	
	
}
