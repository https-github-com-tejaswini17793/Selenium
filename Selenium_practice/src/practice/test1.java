package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		String ExpectedTitle= "Welcome: Mercury Tours";
		String ActualTitle="";
		ActualTitle=driver.getTitle();
		System.out.println(ActualTitle);
		if(ActualTitle.contentEquals(ExpectedTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		
		}
		
	driver.close();		

	}

}
