package StepDefiniton;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;		

public class PostRegSuc {				
    public static void main(String[] args) {									
    	  WebDriver driver= null;
    	String projectPath=System.getProperty("user.dir");
  	  System.out.println("Project path is: " +projectPath);
  	  System.setProperty("webdriver.chrome.driver",projectPath+
  	  "/src/test/resources/drivers/chromedriver.exe"); 
  	  driver = new ChromeDriver();			
        		
        String baseUrl = "http://demo.guru99.com/test/login.html";					
        driver.get(baseUrl);					
        WebElement email = driver.findElement(By.id("email"));							
        WebElement password = driver.findElement(By.name("passwd"));							
        email.sendKeys("abcd@gmail.com");					
        password.sendKeys("abcdefghlkjl");					
        System.out.println("Text Field Set");					
        email.clear();			
        password.clear();			
        System.out.println("Text Field Cleared");					
        WebElement login = driver.findElement(By.id("SubmitLogin"));								
        email.sendKeys("abcd@gmail.com");					
        password.sendKeys("abcdefghlkjl");					
        login.click();			
        System.out.println("Login Done with Click");					
        driver.get(baseUrl);					
        driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");							
        driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");							
        driver.findElement(By.id("SubmitLogin")).submit();					
        System.out.println("Login Done with Submit");					
         
		//driver.close();		
        		
    }		
}