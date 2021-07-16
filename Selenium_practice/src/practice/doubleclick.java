package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class doubleclick {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://api.jquery.com/dblclick/#dblclick");
		driver.manage().window().maximize();
        driver.switchTo().frame(0);
        Actions action = new Actions(driver);

        WebElement ele = driver.findElement(By.cssSelector("html>body>div"));
        //Here I used JavascriptExecutor interface to scroll down to the targeted element
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
        //used doubleClick(element) method to do double click action
          action.doubleClick(ele).build().perform();
          String name=ele.getText();
          System.out.println(name);
          Thread.sleep(5000);
        //Once clicked on the element, the color of element is changed to yellow color from blue color
        //driver.close();

	}

}
