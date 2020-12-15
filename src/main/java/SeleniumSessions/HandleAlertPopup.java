package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.getText();
		String text = alert.getText();
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct alert message");
		}
		else {System.out.println("incorrect alert message");}
	
	    alert.accept(); // to click on OK button
	  //  alert.dismiss();  // to click on cancel button
	   driver.switchTo().defaultContent();
	}
      
}
