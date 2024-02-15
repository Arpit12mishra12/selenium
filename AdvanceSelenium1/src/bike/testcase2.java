package bike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase2 {
	@Test(groups = "smoke")
	public void hero()
	{
		ChromeDriver  driver=new ChromeDriver();
		driver.get("https://www.heromotocorp.com/en-in.html");
	}

}



