package StepDefiniton;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class WaitMethods {
	
	protected WebDriver driver;
	@Test
	public void cosmocode() throws InterruptedException 
	{
		 WebDriver driver= null;
		  String projectPath=System.getProperty("user.dir");
		  System.out.println("Project path is: " +projectPath);
		  System.setProperty("webdriver.chrome.driver",projectPath+
		  "/src/test/resources/drivers/chromedriver.exe"); 
		  driver = new ChromeDriver(); 
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	String eTitle = "COSMOCODE";
	String aTitle = "" ;
	
	driver.get("https://cosmocode.io/automation-practice-webtable/" );
	
	driver.manage().window().maximize() ;

	aTitle = driver.getTitle();
	
	if (aTitle.equals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}
	//close browser
	driver.close();
}
}