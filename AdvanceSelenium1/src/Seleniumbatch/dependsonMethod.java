package Seleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dependsonMethod {
	@Test(dependsOnMethods = "register")
    public void login()
    {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
    }
@Test()
public void register()
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Register")).click();
	
}
@Test()
public void logout()
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
}
}
