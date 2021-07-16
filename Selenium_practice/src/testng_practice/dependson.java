package testng_practice;

import org.testng.annotations.Test;

public class dependson {
	@Test(dependsOnMethods = {"testCase2"})
	 public void testCase1(){
	 System.out.println("Test Case 1");
	 }
	 @Test
	 public void testCase2(){
	 System.out.println("Test Case 2");
	 }
	 @Test(dependsOnMethods = {"testCase2"})
	 public void testCase3(){
	 System.out.println("Test Case 3");
	 }
	 
}
