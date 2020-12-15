package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearchBar {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes");
		Thread.sleep(4000);
		List<WebElement> amazonList = driver.findElements(By.xpath("//*[@id ='suggestions']//span"));
		System.out.println(amazonList.size());
		for(WebElement e : amazonList) {
			String text = e.getText();
			System.out.println(text);
	
			if(text.contains("men")) {
				e.click();
				break;
			}
		}
		
	}

}
