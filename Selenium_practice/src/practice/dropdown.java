package practice;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		 driver.navigate().refresh();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='dropdown']"));
		Select s=new Select(dropdown);
		//s.selectByVisibleText("QTP");
		//s.selectByValue("ddqtp");
		s.selectByIndex(3);
		//get the text of selected option
		//WebElement option =s.getFirstSelectedOption();
		 //System.out.println(option.getText()); //output "Selenium"
		//Get all options
		List<WebElement> options=s.getOptions();
		 for(WebElement option:options)
		 {
			 System.out.println(option.getText());
		 }
		

	}

}
