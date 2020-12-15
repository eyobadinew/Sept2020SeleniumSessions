package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void loginToApp() {
		System.out.println("User logged in");
		//int i = 4/0;
	}
    @Test(dependsOnMethods = "loginToApp")
    public void checkUserProfile() {
    	System.out.println("Profile check");
    }
    
}
