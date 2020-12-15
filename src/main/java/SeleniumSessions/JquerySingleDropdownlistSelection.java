package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JquerySingleDropdownlistSelection {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(3000);
		
	/*	List<WebElement> choiceList = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
        System.out.println(choiceList.size());
        
        for(WebElement e :choiceList) {
        	String text = e.getText();
        	System.out.println(text);
        	if(text.equals("choice 2 2")) {
        		e.click();
        		break;
        	}
        }*/
       
		//Generic code from line 36-53
		By choice_list = By.xpath("//span[@class='comboTreeItemTitle']");
        selectChoiceFromDropdownList( choice_list,"choice 2");
       	
	}
public static void selectChoiceFromDropdownList(By locator,String value) {
	List<WebElement> choiceList = driver.findElements(locator);
    System.out.println(choiceList.size());
    
    for(WebElement e :choiceList) {
    	String text = e.getText();
    	System.out.println(text);
    	if(text.equals(value)) {
    		e.click();
    		break;
    	}
    }
    	
}
}

