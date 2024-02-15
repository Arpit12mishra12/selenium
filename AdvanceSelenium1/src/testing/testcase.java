package testing;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testcase extends baseclass {
	@Test
	public void tc()
	{
		driver.findElement(By.xpath("(//a[@href=\"/digital-downloads\"])[1]")).click();
		//driver.findElement(By.xpath("//input[@onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/53/1/1    ');return false;\"]")).click();
		Reporter.log("@Test",true);
	}

}
