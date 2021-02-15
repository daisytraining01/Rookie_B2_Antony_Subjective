package StepDefiniton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;

public class SelectAustralia  {
 public static void main(String[] args) { 
	 WebDriver driver= null;
	  String projectPath=System.getProperty("user.dir");
	  System.out.println("Project path is: " +projectPath);
	  System.setProperty("webdriver.chrome.driver",projectPath+
	  "/src/test/resources/drivers/chromedriver.exe"); 
	  driver = new ChromeDriver();
	    String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		driver.get(baseURL);

		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("AUSTRALIA");
		

		driver.close();
 }
}
