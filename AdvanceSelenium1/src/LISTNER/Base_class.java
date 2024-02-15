package LISTNER;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(Listener_implimentation.class)
public class Base_class {
	@BeforeSuite
public void connectserver()
{
		Reporter.log("connecting to server",true);
}
	@BeforeTest
	public void connecttodatabase()
	{
		Reporter.log("connct to database",true);
	}
	 public static ChromeDriver driver;
	@BeforeClass
	public void openbrowser() {
		Reporter.log("open the browser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
		Reporter.log("close the browser",true);

	}
	@AfterTest
	public void disconnecthedatabase()
	{
		Reporter.log("disconnct the database",true);
		
	}
	@AfterSuite
	public void disconnecttheserver()
	{
		Reporter.log("disconnect to server",true);
	}
	
}


