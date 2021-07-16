package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		WebElement firstname=driver.findElement(By.id("firstName"));
		firstname.sendKeys("Tejaswini");
		WebElement lastname=driver.findElement(By.id("lastName"));
		firstname.sendKeys("Borhade");
		WebElement email=driver.findElement(By.cssSelector("input#userEmail"));
		email.sendKeys("ahertejaswini@gmail.com");
		
		WebElement gender=driver.findElement(By.id("gender-radio-1"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", gender);

	}

}
