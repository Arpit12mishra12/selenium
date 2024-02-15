package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases {
	

	@Test
	public void testCase()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		RegirationPage rp=new RegirationPage(driver);
		
		rp.getRegbutton().click();
		rp.getGender().click();
		rp.getFirstname().sendKeys("sumit");
		rp.getLastname().sendKeys("sahu");
		rp.getEmail().sendKeys("sumitsahu1010@gmail.com");
		rp.getPassword().sendKeys("1234567");
		rp.getConfirmpasswpord().sendKeys("1234567");
		rp.getRegisterbutton().click();
		
		
	}
}
