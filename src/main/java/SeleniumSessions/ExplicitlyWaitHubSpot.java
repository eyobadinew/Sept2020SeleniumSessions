package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWaitHubSpot {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://app.hubspot.com/");
		WebDriverWait wait = new WebDriverWait(driver,6);
		wait.until(ExpectedConditions.titleContains("Login"));
		wait.until(ExpectedConditions.titleIs("HubSpot Login"));
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.id("username")).sendKeys("test@1234.com");
		//driver.findElement(By.id("password")).sendKeys("@1234");
	//	driver.findElement(By.id("loginbtn")).click();
	}

}
