package Seleniumbatch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assi1 {
	@Test
	public void register()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("[class='ico-register']")).click();
		driver.findElement(By.cssSelector("[id='gender-male']")).click();
        driver.findElement(By.cssSelector("[id='FirstName']")).sendKeys("arpit",Keys.TAB,"mishra",Keys.TAB,"arpitmmishra9@gmail.com",Keys.TAB,"arpit@123",Keys.TAB,"arpit@123",Keys.ENTER);
        //driver.findElement(By.cssSelector("[id='register-button']")).click();
      //driver.findElement(By.cssSelector("[class='button-1 register-continue-button']")).click();
        driver.findElement(By.cssSelector("[class='ico-logout']")).click();
	}
	
	@Test(dependsOnMethods = "register")
	public void login()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.cssSelector("[id='Email']")).sendKeys("arpitmmishra9@gmail.com",Keys.TAB,"arpit@123",Keys.ENTER);
        driver.findElement(By.cssSelector("[id='RememberMe']")).click();
        driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();
	}
	
}