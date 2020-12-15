package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementHomeWork {

	public static void main(String[] args) throws InterruptedException {
		
		// Mouse over to LOGIN/SIGNUP --> Spice Club Members ---> Sign up
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(6000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id='ctl00_HyperLinkLogin']"))).build().perform();
		Thread.sleep(6000);
		act.moveToElement(driver.findElement(By.xpath("//*[text()='SpiceClub Members']"))).build().perform();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[text()='Sign up']")).click();
	}

}
