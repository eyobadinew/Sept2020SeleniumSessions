package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rightClick).perform();
		
	   List<WebElement> rightClickOptions = 
			   driver.findElements(By.xpath("//ul/li[contains(@class,'context-menu-item context-menu-icon')]"));
		System.out.println(rightClickOptions.size());	
		
		for(WebElement e :rightClickOptions) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.contains("Copy")) {
				e.click();
				break;
			}
		}
	
	}

}
