package testng_practice;

import org.testng.annotations.Test;

public class Testng_exception {
	@Test(expectedExceptions = ArithmeticException.class)
	 public void testException() {
	 System.out.println("SoftwareTestingMaterial.com");
	 int i = 1 / 1; 
	 }
}
