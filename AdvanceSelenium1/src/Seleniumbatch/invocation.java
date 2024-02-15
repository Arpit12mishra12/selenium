package Seleniumbatch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class invocation {

	@Test(priority=3,invocationCount=3)
	public void login()
	{
		    ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
	}
	@Test(priority = 1)
	public void register()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
	}


	@Test(priority = 2)
	public void logout()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
	}
}
