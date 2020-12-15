package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
 WebDriver driver;
 public ElementUtil(WebDriver driver) {
	 this.driver = driver;
 }
public By getLocator(String value) {
	return By.id(value);
}	
public WebElement getElement(By locator) {
	return  driver.findElement(locator);
	}
public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
public void doSendKeys(By locator ,String value) {
	getElement(locator).sendKeys(value);
}
public void doActionsSendKeys(By locator,String value) {
	Actions act = new Actions(driver);
	act.sendKeys(getElement(locator), value).perform();
}
public void doActionsClick(By locator) {
	getElement(locator).click();
}
public void doClick(By locator) {
	getElement(locator).click();
}
public String doGetText(By locator) {
	return getElement(locator).getText();
}

public boolean doIsDisplayed(By locator) {
	return getElement(locator).isDisplayed();
}

public int getElementsCount(String tagName) {
	return driver.findElements(By.tagName(tagName)).size();
}

public List<String> getAttributesList(String tagName, String attributeName) {
	
	List<String> attrList = new ArrayList<String>();
	
	List<WebElement> elementList = driver.findElements(By.tagName(tagName));
	for(WebElement e : elementList) {
		String text = e.getAttribute(attributeName);
		attrList.add(text);
	}
	
	return attrList;
}

public void doClickFromList(By locator, String linkText) {
	List<WebElement> footerList = getElements(locator);

	for (int i = 0; i < footerList.size(); i++) {
		String text = footerList.get(i).getText();
		if (text.equals(linkText)) {
			footerList.get(i).click();
			break;
		}
	}
}
 //*****************Drop Downs****************************

public void doSelectDropdownByVisibleText(By locator,String text) {
	getElement(locator);
	Select s = new Select(getElement(locator));
	s.selectByVisibleText(text);
	
}
public void doSelectDropDownByIndex(By locator, int index) {
	Select select = new Select(getElement(locator));
	select.selectByIndex(index);
}

public void doSelectDropDownByValue(By locator, String value) {
	Select select = new Select(getElement(locator));
	select.selectByValue(value);

}
public void selectDropDownValueWithoutSelectClass(By locator, String value) {
	List<WebElement> optionsList = getElements(locator);

	for (WebElement e : optionsList) {

		String text = e.getText();

		if (text.equals(value)) {
			e.click();
			break;
		}

	}
}

}
