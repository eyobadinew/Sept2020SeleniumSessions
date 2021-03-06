package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtilAsk {
WebDriver driver;
	public ElementUtilAsk(WebDriver driver) {
		this.driver = driver;
	}
	public By getLocator(String value) {
		return By.id(value);
	}
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	public void doSendKeys(By locator, String value ) {
		driver.findElement(locator).sendKeys(value);
	}
	public void doClick(By locator) {
		driver.findElement(locator).click();
	}

}
