package testng_practice;

import org.testng.annotations.Test;

public class groupdemo {
@Test(groups= {"sanity"})
public void perform()
{
	System.out.println("Everything is perfect");
}
@Test(groups= {"regression"})
public void perform_secondgroup()
{
	System.out.println("I am in regression group");
}
}
