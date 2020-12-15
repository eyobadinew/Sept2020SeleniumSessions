package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobaElementUtil {
 WebDriver driver;
 
 public JobaElementUtil(WebDriver driver) {
	 this.driver = driver;
 }
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	public void doClick(By locator) {
		getElement(locator).click();
	}
	public void isDisplayed(By locator) {
		getElement(locator).isDisplayed();
	}
	public void getText(By locator) {
		getElement(locator).getText();
	}
	public void doClickDropdown(By locator) {
		getElement(locator).click();
	}
}
