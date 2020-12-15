package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	/*BS----- Connect to DB
	BT-----createUserInDB
	BC---------launch Browser
	BM------Log in
	
	TC1 User active
	AM-------Logout
	
	BM------Log in
	TC2 Profile check
	AM-------Logout
	
	BM------Log in
	TC3user info
	AM-------Logout
	
	AC=----close browser
	AT-------delete user form DB
	AS-------disconnect DB
	*/
	@BeforeSuite
	public void ConnectDB() {
		System.out.println("BS----- Connect to DB");
	}
	@BeforeTest
	public void createUserInDB() {
		System.out.println("BT-----createUserInDB");
	}
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC---------launch Browser");
	}
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM------Log in");
	}
	
	@Test
	public void getUserInfoTest() {
		System.out.println("user info");
	}
	@Test
	public void checkUserIsActiveTest() {
		System.out.println("User active");
	}
	
	@Test
	public void checkUserProfileTest() {
		System.out.println("Profile check");
	}
	
	
	
	@AfterMethod
	public void logout() {
		System.out.println("AM-------Logout");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC=----close browser");
	}
	@AfterTest
	public void deleteUserinDB() {
		System.out.println("AT-------delete user form DB");
	}
   @AfterSuite
   public void disconnectDB() {
	   System.out.println("AS-------disconnect DB");
   }
}
