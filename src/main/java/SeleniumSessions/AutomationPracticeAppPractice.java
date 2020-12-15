package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeAppPractice {
 static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q'and@type='text']")).sendKeys("eyob adinew");
		driver.findElement(By.id("email_create")).sendKeys("eyobabizuneh@gmail.com");
		driver.findElement(By.xpath("//input[@type='hidden' and @name='SubmitCreate']")).click();
		
        driver.quit();
	}

}
