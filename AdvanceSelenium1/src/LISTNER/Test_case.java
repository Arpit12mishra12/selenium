package LISTNER;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test_case extends Base_class {
	@Test
	public void m1()
	{
		driver.findElement(By.xpath("//a[@class='ico-lgin']")).click();
		driver.findElement(By.cssSelector("[id='Email']")).sendKeys("arpitmmishra9@gmail.com",Keys.TAB,"arpit@123",Keys.ENTER);
	}

	@Test
	public void m2()
	{
		driver.findElement(By.linkText("reister")).click();
	}
}
