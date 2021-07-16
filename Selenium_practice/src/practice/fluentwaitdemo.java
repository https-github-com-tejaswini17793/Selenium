package practice;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import com.google.common.base.Function;

public class fluentwaitdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		String ExpectedTitle= "Demo Guru99 Page";
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
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver) 
				.withTimeout(20, TimeUnit.SECONDS) //maximum time
				.pollingEvery(5, TimeUnit.SECONDS) //polls after 5 sec
				.ignoring(NoSuchElementException.class); //ignore exception
		WebElement clickselenium=wait.until(new Function<WebDriver,WebElement>()
				{
			        public WebElement apply(WebDriver driver)
			        {
			        	return driver.findElement(By.cssSelector("i.icon-wrench"));
			        }
			        
			        });
			        clickselenium.click();
				

	}

	
	}


