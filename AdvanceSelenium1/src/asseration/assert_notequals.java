package asseration;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assert_notequals {
	@Test
	public void register()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement a = driver.findElement(By.cssSelector("[class='ico-register']"));
	String actual = a.getText();
	a.click();
		driver.findElement(By.cssSelector("[id='gender-male']")).click();
        driver.findElement(By.cssSelector("[id='FirstName']")).sendKeys("arpit",Keys.TAB,"mishra",Keys.TAB,"arpitmmishra40@gmail.com",Keys.TAB,"arpit@123",Keys.TAB,"arpit@123",Keys.ENTER);
      String expected = driver.findElement(By.linkText("arpitmmishra40@gmail.com")).getText() ;
     Assert.assertNotEquals(actual, expected);
     driver.quit();
}
}
