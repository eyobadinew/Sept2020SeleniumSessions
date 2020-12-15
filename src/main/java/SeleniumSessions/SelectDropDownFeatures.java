package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownFeatures {
	 static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
	    WebElement w = driver.findElement(By.id("Form_submitForm_Industry"));
	Select s = new Select(w);
	List<WebElement> Options = s.getOptions();
	System.out.println(Options.size());
	
	for(WebElement e :Options) {
		System.out.println(e.getText());
	}
	for(int i =0 ; i<Options.size();i++) {
		System.out.println(Options.get(i).getText());
	}
	}
// generic method 
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public void doSelectDropdownOptions(By locator) {
		getElement(locator);
		Select o = new Select(getElement(locator));
		System.out.println(o.getOptions().size());
	}
}
