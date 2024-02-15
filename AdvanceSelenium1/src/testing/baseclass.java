package testing;

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

public class baseclass {
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
	ChromeDriver driver=new ChromeDriver();
	@BeforeClass
	public void openbrowser() {
		Reporter.log("open the browser",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
	}
	@BeforeMethod
	public void login()
	{

		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.cssSelector("[id='Email']")).sendKeys("arpitmmishra9@gmail.com",Keys.TAB,"arpit@123",Keys.ENTER);
		 driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
		 
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
	@AfterClass
	public void closebrowser()
	{
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
