package testng_practice;

import org.testng.annotations.Test;

public class Ignore_testcase {
@Test(enabled=false)
public void print()
{
	System.out.println("This is first test case");
}
@Test(enabled=true)
public void print1()
{
	System.out.println("This is first test case1");
}
}
