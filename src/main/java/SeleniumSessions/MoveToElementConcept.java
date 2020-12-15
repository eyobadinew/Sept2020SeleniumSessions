package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
		Thread.sleep(3000);    // give time before performing action
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("COURSES")).click();
        
	}

}
