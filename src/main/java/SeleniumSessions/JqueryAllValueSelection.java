package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryAllValueSelection {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(3000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(3000);
	
		By choice_list = By.xpath("//span[@class='comboTreeItemTitle']");
       selectChoiceFromDropdownList( choice_list,"All");
       
	}
	public static void selectChoiceFromDropdownList(By locator,String... value) {
		List<WebElement> choiceList = driver.findElements(locator);
	    System.out.println(choiceList.size());
	    
	    if(!value[0].equals("All")) {
	    for (int i = 0; i < choiceList.size(); i++) {
			String text = choiceList.get(i).getText();
			System.out.println(text);

			for (int j = 0; j < value.length; j++) {
				if (text.equals(value[j])) {
					choiceList.get(i).click();
					break;
	    	}
	    }
	    	
	}
	}
	    else {
	    	try {
	    	for(WebElement e:choiceList) {
	    		e.click();
	    	}
	    }   
	    
	    catch(Exception e) {
	    	
	    }
	}
	}
}
