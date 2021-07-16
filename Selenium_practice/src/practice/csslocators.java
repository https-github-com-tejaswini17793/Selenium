package practice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class csslocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup?d=70130000000td6N");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//first-of-type
		//form#deorg_form>input:first-of-type
		//last-of-type
		//	//form#deorg_form>input:last-of-type
		
		//nth-of-tpye
		//form#deorg_form>input:nth-of-type(2)
		//css by tagname.id
		WebElement firstname=driver.findElement(By.cssSelector("input#first_name"));
		firstname.sendKeys("Tejaswini");
		
		//css by multiple attributes
		WebElement lastname=driver.findElement(By.cssSelector("input.textField[name='user[last_name]']"));
		lastname.sendKeys("Borhade");
		
		WebElement email=driver.findElement(By.cssSelector("input[type='email'][id='email']"));
		email.sendKeys("ahertejaswini@gmail.com");
		
		//parent and child
		WebElement role=driver.findElement(By.cssSelector("select#job_role>option[value='Developer']"));
		role.click();
		//child
		WebElement country=driver.findElement(By.cssSelector("select.textFieldOp option[value='US']"));
		//Adjecent
		//option[value='Developer']+option[value='Architect/CTO']
		//first-child
		//select#job_role>:first-child
		//last-child
		//select#job_role>:last-child
		//n-th child
		//select#job_role>:nth-child(2)
		//last-nth-child
		//select#job_role>:nth-last-child(2)
		
		//WebElement postalcode=driver.findElement(By.cssSelector("input#postal_code"));
		//Prefix selector
		WebElement postalcode=driver.findElement(By.cssSelector("input[name^='user[p']"));
		postalcode.sendKeys("422009");
		
		//WebElement username=driver.findElement(By.cssSelector("input#username[type='email']"));
		//suffix selector
		WebElement username=driver.findElement(By.cssSelector("input[placeholder$='.com']"));
		//Substring
		//input[placeholder*='yourcompany']
		username.sendKeys("tejaswini@abc.in");
		
		
		WebElement chekbox=driver.findElement(By.cssSelector("input[type='checkbox'][value='explicit']"));
		chekbox.click();
		

	}

}
