package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	@Test(invocationCount = 10)
	public void createUserTest() {
		System.out.println("User is created");
	}
/*User is created
User is created
User is created
User is created
User is created
User is created
User is created
User is created
User is created
User is created
PASSED: createUserTest
PASSED: createUserTest
PASSED: createUserTest
PASSED: createUserTest
PASSED: createUserTest
PASSED: createUserTest
PASSED: createUserTest
PASSED: createUserTest
PASSED: createUserTest
PASSED: createUserTest

===============================================
    Default test
    Tests run: 10, Failures: 0, Skips: 0
===============================================*/
}
