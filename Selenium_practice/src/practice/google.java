package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=null;
		try {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@role=\"listbox\"]//following::li[2]")).click();
			
			
			Thread.sleep(2500);
			String str=driver.findElement(By.xpath("//*[@id=\"result-stats\"]")).getText();
			System.out.println("Result"+str);
			driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
			Thread.sleep(5000);
			String websitename=driver.getCurrentUrl();
			System.out.println(websitename);
			driver.findElement(By.xpath("//a[@href='/downloads' and @class='nav-item']")).click();
			driver.findElement(By.xpath("//p[contains(text(),'Latest')]//a[contains(text(),'3.141.59') and contains(@href,'standalone-3.141.59.jar')]")).click();
			//driver.findElement(By.xpath("//a[@href=\"https://chrome.google.com/webstore/detail/selenium-ide/mooikfkahbdckldjjndioackbalphokd\"]")).click();
			Thread.sleep(5000);
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			//driver.close();
	}

}
}
