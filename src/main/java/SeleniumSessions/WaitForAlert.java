package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForAlert {
	static WebDriver driver;
public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/javascript_alerts");
driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

//WebDriverWait wait = new WebDriverWait(driver,6);
//Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//System.out.println(alert.getText());

//alert.accept();

Alert a =waitForAlert(6);
System.out.println(a.getText());
a.accept();
	}
public static Alert waitForAlert(int timeout) {
	WebDriverWait wait = new WebDriverWait(driver,timeout);
	return wait.until(ExpectedConditions.alertIsPresent());
}
}
