package Seleniumbatch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class timeout {
	@Test(timeOut = 20000)
			
	public void login()
	{
		    ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
	}

}
