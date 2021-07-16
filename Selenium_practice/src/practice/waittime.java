package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waittime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().deleteAllCookies();
		//Implicit wait-appicable throughout the page
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement electronics=driver.findElement(By.xpath("//a[@href='https://www.ebay.com/b/Electronics/bn_7000259124']//preceding::li[@data-currenttabindex='0']"));
	    electronics.click();
	    //Expiicit wait
	    WebDriverWait explicitwait=new WebDriverWait(driver,20);
	    WebElement smartwatch=driver.findElement(By.xpath("//div[text()='Smart Watches']"));
	    explicitwait.until(ExpectedConditions.visibilityOf(smartwatch));
	    smartwatch.click();
	}

}
