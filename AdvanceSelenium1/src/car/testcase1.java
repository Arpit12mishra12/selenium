package car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase1 {
	@Test(groups = "smoke")
	public void safari()
	{
		ChromeDriver  driver=new ChromeDriver();
		driver.get("https://cars.tatamotors.com/safari/ice.html");
	}

}


