package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitHubSpot {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("http://app.hubspot.com/");
		driver.findElement(By.id("username")).sendKeys("test@1234.com");
		driver.findElement(By.id("password")).sendKeys("@1234");
		driver.findElement(By.id("loginbtn")).click();
		
	}

}
