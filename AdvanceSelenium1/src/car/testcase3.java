package car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase3 {
	@Test(dependsOnGroups = "smoke")
	public void scorpio()
	{
		ChromeDriver  driver=new ChromeDriver();
		driver.get("https://auto.mahindra.com/suv/scorpio-n");
	}

}


