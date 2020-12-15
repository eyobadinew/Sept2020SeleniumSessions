package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WEbTableCheckboxtraining {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		
		
		driver.findElement(By.xpath("(//*[@type='checkbox'])[2]")).click();
		driver.findElement(By.xpath("(//*[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//*[@type='checkbox'])[4]")).click();
		driver.findElement(By.xpath("(//*[@type='checkbox'])[5]")).click();
		
	/*	options.size();
		for(WebElement e: options) {
			String text = e.getText();
			Option.add(text);
        
	}*/
	
	
	
	}
}
