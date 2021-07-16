package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class rightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions action=new Actions(driver);
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(rightclick).build().perform();
		WebElement selectedoption=driver.findElement(By.cssSelector("li[class='context-menu-item context-menu-icon context-menu-icon-copy']"));
		String selectedtext=selectedoption.getText();
		System.out.println(selectedtext);

	}

}
