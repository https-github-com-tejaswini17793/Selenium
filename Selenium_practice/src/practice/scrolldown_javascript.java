package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class scrolldown_javascript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com");
		//to perform Scroll on application using  Selenium
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,550)", "");
         //to scroll to the bottom of the page
		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

}
