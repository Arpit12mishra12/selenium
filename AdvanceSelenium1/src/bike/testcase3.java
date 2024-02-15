package bike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase3 {
	@Test(groups = "Regression")
	public void honda()
	{
		ChromeDriver  driver=new ChromeDriver();
		driver.get("https://honda2wheelersindia.com/");
	}

}



