package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExecptionMethod {
	String name;
	@Test(expectedExceptions = ArithmeticException.class)
    public void arithmeticTest() {
    	System.out.println("Quant check");
    	int k = 8/0;
    }
	@Test(expectedExceptions = Exception.class)
    public void exceptionTest() {
    	System.out.println("Quant check");
    	int k = 8/0;
    }
	@Test(expectedExceptions = Throwable.class)
    public void throwableTest() {
    	System.out.println("Quant check");
    	int k = 8/0;
     
    }
	@Test(expectedExceptions = {ArithmeticException.class,NullPointerException.class})
    public void groupOfExceptionTest() {
    	System.out.println("Quant check");
    	int k = 8/0;
    	ExpectedExecptionMethod obj = new ExpectedExecptionMethod();
    	obj = null;
    	obj.name = "testing";
     
    }
}
