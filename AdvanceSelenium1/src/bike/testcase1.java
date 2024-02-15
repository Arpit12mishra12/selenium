package bike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase1 {
	@Test(groups = "smoke")
	public void bajaj()
	{
		ChromeDriver  driver=new ChromeDriver();
		driver.get("https://www.bajajauto.com/");
	}

}
