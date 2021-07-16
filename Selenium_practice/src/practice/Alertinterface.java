package practice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alertinterface {
	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://softwaretestingplace.blogspot.com/2017/03/javascript-alert-test-page.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement tryit=driver.findElement(By.cssSelector("button[onClick$='ion()']"));
	tryit.click();
	Alert alert=driver.switchTo().alert();
	String print=alert.getText();
	System.out.println(print);
	alert.accept();
	Thread.sleep(5000);
	tryit.click();
	Thread.sleep(5000);
	alert.dismiss();
}
}