package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableprepgettext {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
		driver.get("https://chercher.tech/webdriverio/dynamic-webtable");
		
		getText("google.com");
		getText("facebook.com");
		getText("selenium-webdriver.com");
	}
public static void getText(String name) {
	WebElement s = driver.findElement(By.xpath("//td[text() ='"+name+"']//following-sibling::td"));
	String text = s.getText();
	System.out.println(text);

}
}
