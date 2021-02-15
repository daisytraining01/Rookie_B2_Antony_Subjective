package StepDefiniton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeatchLinks {
 
 public static void main(String[] args){
	  WebDriver driver= null;
	  String projectPath=System.getProperty("user.dir");
	  System.out.println("Project path is: " +projectPath);
	  System.setProperty("webdriver.chrome.driver",projectPath+
	  "/src/test/resources/drivers/chromedriver.exe"); 
	  driver = new ChromeDriver();
 driver.get("https://wordpress.com/?aff=58022&cid=8348279\r\n"
 		+ "");
 driver.manage().window().maximize();
 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
 for(WebElement link:allLinks){
 System.out.println(link.getText() + " - " + link.getAttribute("href"));
 
   driver.quit();
 } 
 }
}
