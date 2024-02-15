package car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase2 {
	@Test(groups = "regression")
	public void fortuner()
	{
		ChromeDriver  driver=new ChromeDriver();
		driver.get("https://www.toyotabharat.com/showroom/fortuner/index-fortuner.html");
	}

}


