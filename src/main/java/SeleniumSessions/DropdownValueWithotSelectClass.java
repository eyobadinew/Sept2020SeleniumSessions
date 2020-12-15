package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownValueWithotSelectClass {
  static WebDriver driver;
	public static void main(String[] args) {
		// Don't use select class from selenium and select the value from the dropdown list
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		List<WebElement> options= driver.findElements(By.xpath("//*[@id='Form_submitForm_Industry']/option"));
		System.out.println(options.size());
		for(WebElement e:options) {
		//	System.out.println(e.getText());
			String text = e.getText();
			if(text.equals("Education")) {
				e.click();
				break;
			}
		}
        
	}

}
