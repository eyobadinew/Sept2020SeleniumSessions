package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JobaAskTest {

	public static void main(String[] args) {
		
		jobaBrowserUtil test = new jobaBrowserUtil();
		WebDriver driver = test.initialize_browser("chrome");
		test.getUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		String s =test.getTitle("Title");
		System.out.println(s);

		By First_name = By.xpath("//*[@id ='Form_submitForm_FirstName']");
		By Last_name = By.xpath("//*[@id ='Form_submitForm_LastName']");
		By Email = By.xpath("//*[@id ='Form_submitForm_Email']");
		By Job_title = By.xpath("//*[@id ='Form_submitForm_JobTitle']");
		By Company = By.xpath("//*[@id ='Form_submitForm_CompanyName']");
		By Phone_number = By.xpath("//*[@id ='Form_submitForm_Contact']");
		By No_ofEmployees = By.xpath("//*[@id ='Form_submitForm_NoOfEmployees']/option[3]");
		By Industry = By.xpath("//*[@id ='Form_submitForm_Industry']/option[3]");
		By Country = By.xpath("//*[@id ='Form_submitForm_Country']/option[3]");

		
		
		
		JobaElementUtil test1 = new JobaElementUtil(driver);
		test1.doSendKeys(First_name, "Fikir");
		test1.doSendKeys(Last_name, "Yashenifal");
		test1.doSendKeys(Email, "abcd@gmail.com");
		test1.doSendKeys(Job_title, "12345");
		test1.doSendKeys(Company, "123456");
		test1.doSendKeys(Phone_number, "123456");
		test1.doClickDropdown(No_ofEmployees);
		test1.doClickDropdown(Industry);
		test1.doClickDropdown(Country);
		
		
	
		//test.closeBrowser();
		
	}

}
