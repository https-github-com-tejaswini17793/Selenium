package practice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class keyboardactions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		Actions action =new Actions(driver);
		WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
		action.keyDown(firstname, Keys.SHIFT);
		action.sendKeys("tejaswini");
		action.keyUp(Keys.SHIFT);
		action.build().perform();
		
		driver.navigate().to("https://demoqa.com/text-box");
		WebElement username=driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement useremail=driver.findElement(By.cssSelector("input[id='userEmail']"));
		WebElement curradd=driver.findElement(By.cssSelector("textarea[id='currentAddress']"));
		//WebElement peradd=driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
		WebElement submit=driver.findElement(By.cssSelector("button[id='submit']"));
		
		action.keyDown(username, Keys.SHIFT).sendKeys("tejaswini aher").keyUp(Keys.SHIFT).build().perform();
		action.sendKeys(useremail,"ahertejaswini@gmail.com").perform();
		action.sendKeys(curradd,"Nashik");
		action.keyDown(curradd,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		action.keyUp(Keys.CONTROL).perform();
		action.keyUp(Keys.CONTROL).perform();
		action.sendKeys(Keys.TAB).perform();
		
		action.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		action.keyUp(Keys.CONTROL).perform();
		action.sendKeys(Keys.TAB).perform();
		action.click(submit).perform();
	}

}
