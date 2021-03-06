package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtilRegn {
    WebDriver driver;
 
    public ElementUtilRegn(WebDriver driver) {
    	this.driver = driver;
        }
    public By getLocator(String value) {
    	return By.id(value);
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


}

